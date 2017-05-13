package com.cedar.mta.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cedar.mta.entity.GiftCard;
import com.cedar.mta.entity.Movie;

public interface GiftRepository extends JpaRepository<GiftCard,Integer> {	
	@Query(value="select * from giftcard where accountId = :account_id", nativeQuery = true)
	List<GiftCard> findAllGiftCardByAccountId(@Param("account_id") Integer accountId);
	
	@Query(value="select * from giftcard where giftCode = :gift_code", nativeQuery = true)
	GiftCard findGiftCardByCode(@Param("gift_code") String giftCode);

	@Transactional
	@Modifying
	@Query(value="insert into giftcard(giftAmount, giftCode, accountId) values(:gift_amount, :gift_code, :account_id)", nativeQuery = true)
	void insertGiftCard(@Param("gift_amount") BigDecimal giftAmount,@Param("gift_code") String giftCode,@Param("account_id") Integer accountId);
	
	
	@Transactional
	@Modifying
	@Query(value="update giftcard set giftAmount = giftAmount - :gift_amount where giftCode = :gift_code", nativeQuery = true)
	void updateGiftBalance(@Param("gift_amount") BigDecimal giftAmount,@Param("gift_code") String giftCode);
	
	@Transactional
	@Modifying
	@Query(value="update user set balance = balance + :gift_balance where accountId = :id", nativeQuery = true)
	void updateUserBalance(@Param("gift_balance") BigDecimal giftBalance,@Param("id") Integer accountId);
}
 