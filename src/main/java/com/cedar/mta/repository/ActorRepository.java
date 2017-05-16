package com.cedar.mta.repository;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Actor;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Rating;

public interface ActorRepository extends JpaRepository<Actor,Integer> {
	
	@Query(value="select * from actor where actorId in(select actors_actorId from castin where movies_movieId = :movie_id)", nativeQuery = true)
	List<Actor> findActors(@Param("movie_id") Integer movieid);
	
	@Transactional
	@Modifying
	@Query(value="insert into actor (actorId, biography, doB, name) values(:actorId, :biography, :doB, :name)", nativeQuery=true)
	void insertActor(@Param("actorId")Integer actorId, @Param("biography")String biography, @Param("doB")String doB, @Param("name")String name);
}
 