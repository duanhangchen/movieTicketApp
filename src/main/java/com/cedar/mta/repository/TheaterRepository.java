package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater,Integer> {
	@Query(value="select * from theater where zipcode > :zipcode1 and zipcode < :zipcode2 limit 10",nativeQuery=true)
	List<Theater> findNearbyTheaters(@Param("zipcode1") int zipcode1,@Param("zipcode2")int zipcode2);
	
	@Query(value="select * from theater where city like %:key% or state like %:key%",nativeQuery=true)
	List<Theater> findCityState(@Param("key") String key);
}
 