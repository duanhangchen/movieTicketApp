package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Actor;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Rating;

public interface ActorRepository extends JpaRepository<Actor,Integer> {
	
	@Query(value="select * from actor where actorId in(select actors_actorId from castin where movies_movieId = :movie_id)", nativeQuery = true)
	List<Actor> findActors(@Param("movie_id") Integer movieid);
	
}
 