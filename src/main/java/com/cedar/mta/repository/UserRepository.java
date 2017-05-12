package com.cedar.mta.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	// List<User> findByLastName(String lastName);
	User findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query(value="update user set  firstName= :firstName, lastName = :lastName where accountId = :accountId", nativeQuery = true)
	void changeUserInfo(@Param ("firstName") String firstName, @Param ("lastName")String lastName,@Param ("accountId") Integer accountId);
}
