package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Ads;
import com.cedar.mta.entity.Movie;

public interface AdRepository extends JpaRepository<Ads,Integer> {

	@Query(value="SELECT * FROM ads", nativeQuery = true)
	List<Ads> findAllAds();
}
 