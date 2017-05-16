package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cedar.mta.entity.Transactions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transactions,Integer>{
	
	@Transactional
	@Modifying
	@Query(value="insert into transactions (transactionAmount,transactionDate,accountId) values(:price,:date,:user_id);",nativeQuery=true)
	void addTransaction(@Param("user_id")Integer user_id,@Param("price")double price,@Param("date")String date);

}
