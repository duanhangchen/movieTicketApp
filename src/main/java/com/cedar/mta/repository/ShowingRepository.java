package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Theater;
import com.cedar.mta.entity.Showing;


public interface ShowingRepository extends JpaRepository<Showing,Integer> {
		
	@Query(value="select * from showing where theaterId = :theater_id)", nativeQuery = true)
	List<Showing> findShowing(@Param("theater_id") Integer theaterid);
	
	@Query(value="select * from showing where theaterId= :theater_id and movieId= :movie_id and showingDate= :date order by startTime asc",nativeQuery=true)
	List<Showing> findShowingByMovie(@Param("theater_id")Integer theaterid,@Param("movie_id")Integer movieid,@Param("date")java.sql.Date date);

}
 