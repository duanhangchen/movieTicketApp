package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cedar.mta.entity.Rating;
import com.cedar.mta.entity.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
	@Query(value="SELECT * FROM review WHERE movie_id= :movie_id",nativeQuery = true)
	List<Review> findReviews(@Param("movie_id")Integer movieid);

	@Query(value="SELECT * FROM review where movie_id = :movie_id and user_id = :user_id", nativeQuery = true)
	Review findReview(@Param("movie_id") Integer movieid,@Param("user_id") Integer userid);
	
	@Query(value="SELECT * FROM review where user_id = :user_id", nativeQuery = true)
	List<Review> findPersonalReview(@Param("user_id") Integer userid);

	@Transactional
	@Modifying
	@Query(value="UPDATE review SET review = :review WHERE movie_id = :movie_id and user_id = :user_id", nativeQuery = true)
	void changeReview(@Param("review") String review_text,@Param("movie_id") Integer movieid,@Param("user_id") Integer userid);
}
