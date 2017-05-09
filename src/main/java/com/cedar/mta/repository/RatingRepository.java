package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cedar.mta.entity.User;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Rating;
public interface RatingRepository extends JpaRepository<Rating, Integer> {
	List<Rating> findByUser(User user);
	
	@Query(value="SELECT * FROM rating where movie_id = :movie_id and user_id = :user_id", nativeQuery = true)
	Rating findRatingScore(@Param("movie_id") Integer movieid,@Param("user_id") Integer userid);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE rating SET score = :score WHERE movie_id = :movie_id and user_id = :user_id", nativeQuery = true)
	void changeRating(@Param("score") int rating_score,@Param("movie_id") Integer movieid,@Param("user_id") Integer userid);
}
