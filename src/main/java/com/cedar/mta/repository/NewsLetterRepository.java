package com.cedar.mta.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.cedar.mta.entity.NewsLetter;

public interface NewsLetterRepository extends JpaRepository<NewsLetter,Integer> {
//	@Query(value="SELECT * FROM movie ORDER BY releaseDate DESC LIMIT 15", nativeQuery = true)
//	List<Movie> findFeaturedMovies();
//	
//	@Query(value="select * from movie where movieId in(select movies_movieId from castin where actors_actorId = :actor_id)", nativeQuery = true)
//	List<Movie> findMoviesByActorId(@Param("actor_id") Integer actorid);
	
	@Transactional
	@Modifying
	@Query(value="insert into newsletter VALUES (:userId, :email)", nativeQuery = true)
	void addUserToNewsLetter(@Param ("userId") Integer userId, @Param ("email") String email);
	
	@Transactional
	@Modifying
	@Query(value="delete from newsletter where userId = :userId", nativeQuery = true)
	void deleteUserFromNewsLetter(@Param ("userId") Integer userId);
	
	@Query(value="select * from newsletter", nativeQuery = true)
	List<NewsLetter> findSubscribers();

}