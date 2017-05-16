package com.cedar.mta.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.cedar.mta.entity.MovieAlert;

public interface MovieAlertRepository extends JpaRepository<MovieAlert,Integer> {
//	@Query(value="SELECT * FROM movie ORDER BY releaseDate DESC LIMIT 15", nativeQuery = true)
//	List<Movie> findFeaturedMovies();
//	
//	@Query(value="select * from movie where movieId in(select movies_movieId from castin where actors_actorId = :actor_id)", nativeQuery = true)
//	List<Movie> findMoviesByActorId(@Param("actor_id") Integer actorid);
	
//	@Transactional
//	@Modifying
//	@Query(value="insert into moviealert VALUES (:userId, :email)", nativeQuery = true)
//	void addUserToNewsLetter(@Param ("userId") Integer userId, @Param ("email") String email);
	
	@Transactional
	@Modifying
	@Query(value="delete from moviealert where userId = :userId and movieId = :movieId", nativeQuery = true)
	void deleteUserFromMovieAlert(@Param ("userId") Integer userId,@Param ("movieId") Integer movieId);
	
	@Query(value="select * from moviealert where movieId= :movieId and userId= :userId", nativeQuery = true)
	MovieAlert findMoviesAlert(@Param("movieId") Integer movieId,@Param("userId") Integer userId);
	
	@Query(value="select * from moviealert where movieId= :movieId", nativeQuery = true)
	List<MovieAlert> findMoviesAlertByMovie(@Param("movieId") Integer movieId);

}