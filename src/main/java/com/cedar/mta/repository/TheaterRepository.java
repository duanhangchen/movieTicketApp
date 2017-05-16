package com.cedar.mta.repository;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Showing;
import com.cedar.mta.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater,Integer> {

	//select * from theater where theaterId in(SELECT theaters_theaterId from cedar.mytheaters where User_accountId=15)
	
	@Query(value="select * from theater where theaterId in(SELECT theaters_theaterId from cedar.mytheaters where User_accountId=:userId)",nativeQuery=true)
	List<Theater> findPersonalTheater(@Param("userId")Integer userId);


	@Query(value="select * from theater where zipcode > :zipcode1 and zipcode < :zipcode2 limit 10",nativeQuery=true)
	List<Theater> findNearbyTheaters(@Param("zipcode1") int zipcode1,@Param("zipcode2")int zipcode2);
	
	@Query(value="select * from theater where city like %:key% or state like %:key%",nativeQuery=true)
	List<Theater> findCityState(@Param("key") String key);

	@Transactional
	@Modifying
	@Query(value="insert into theater (theaterId, AddressLine, city, state, theaterName, zipcode) values(:theaterId, :address, :city, :state, :theaterName, :zipcode)", nativeQuery=true)
	void insertTheater(@Param("theaterId")Integer theaterId, @Param("address")String address, @Param("city")String city, @Param("state")String state, @Param("theaterName")String theaterName, @Param("zipcode")String zipcode);
}
 