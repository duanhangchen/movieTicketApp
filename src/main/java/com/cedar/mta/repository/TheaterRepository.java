package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Showing;
import com.cedar.mta.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater,Integer> {
	
	//select * from theater where theaterId in(SELECT theaters_theaterId from cedar.mytheaters where User_accountId=15)
	
	@Query(value="select * from theater where theaterId in(SELECT theaters_theaterId from cedar.mytheaters where User_accountId=:userId)",nativeQuery=true)
	List<Theater> findPersonalTheater(@Param("userId")Integer userId);

}
 