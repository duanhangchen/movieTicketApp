package com.cedar.mta.repository;

import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cedar.mta.entity.SupportForm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface SupportFormRepository extends JpaRepository<SupportForm,Integer>{
	@Transactional
	@Modifying
	@Query(value="insert into supportform (body,title,userEmail)  values (:body,:title,:email)", nativeQuery = true)
	void addForm(@Param("body")String body,@Param("title")String title,@Param("email")String email);
}
