package com.cedar.mta.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cedar.mta.entity.Rating;
import com.cedar.mta.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	// List<User> findByLastName(String lastName);
	User findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query(value="update user set  firstName= :firstName, lastName = :lastName where accountId = :accountId", nativeQuery = true)
	void changeUserInfo(@Param ("firstName") String firstName, @Param ("lastName")String lastName,@Param ("accountId") Integer accountId);
	
	@Transactional
	@Modifying
	@Query(value="insert into mymovies VALUES (:userId, :movieId)", nativeQuery = true)
	void addMovieToUser(@Param ("userId") Integer userId, @Param ("movieId") Integer movieId);
	
	@Transactional
	@Modifying
	@Query(value="delete from mymovies where User_accountId = :userId and myMovies_movieId = :movieId", nativeQuery = true)
	void deleteMovieFromUser(@Param ("userId") Integer userId, @Param ("movieId") Integer movieId);
	
	@Transactional
	@Modifying
	@Query(value="insert into mytheaters VALUES (:userId, :theatreId)", nativeQuery = true)
	void addTheatreToUser(@Param ("userId") Integer userId, @Param ("theatreId") Integer theatreId);
	
	
	@Transactional
	@Modifying
	@Query(value="delete from mytheaters where User_accountId = :userId and theaters_theaterId = :theatreId", nativeQuery = true)
	void deleteTheatreFromUser(@Param ("userId") Integer userId, @Param ("theatreId") Integer theatreId);
	
	
	@Query(value="SELECT * FROM mymovies where myMovies_movieId = :movieId and User_accountId = :userId", nativeQuery = true)
	Integer findUserFavourite(@Param("movieId") Integer movieId,@Param("userId") Integer userId);
	
	@Query(value="SELECT * FROM mytheaters where theaters_theaterId = :theaterId and User_accountId = :userId", nativeQuery = true)
	Integer findUserFavouriteTheater(@Param("theaterId") Integer movieId,@Param("userId") Integer userId);
}
