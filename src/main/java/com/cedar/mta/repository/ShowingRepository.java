package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Theater;
import com.cedar.mta.entity.Showing;


public interface ShowingRepository extends JpaRepository<Showing,Integer> {
	
	/*
	@Query(value="select * from actor where actorId in(select actors_actorId from castin where movies_movieId = :movie_id)", nativeQuery = true)
	List<Actor> findActors(@Param("movie_id") Integer movieid);
	*/
	
	@Query(value="select * from showing where theaterId = theater_id)", nativeQuery = true)
	List<Showing> findShowing(@Param("theater_id") Integer theaterid);

}
 