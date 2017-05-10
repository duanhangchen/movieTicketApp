package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
	@Query(value="SELECT * FROM movie ORDER BY releaseDate DESC LIMIT 15", nativeQuery = true)
	List<Movie> findFeaturedMovies();
	
	@Query(value="select * from movie where movieId in(select movies_movieId from castin where actors_actorId = :actor_id)", nativeQuery = true)
	List<Movie> findMoviesByActorId(@Param("actor_id") Integer actorid);

}
 