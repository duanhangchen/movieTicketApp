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
	@Query(value="SELECT * FROM review WHERE movie_id= :movie_id order by id desc",nativeQuery = true)
	List<Review> findReviews(@Param("movie_id")Integer movieid);

	@Query(value="SELECT * FROM review where movie_id = :movie_id and user_id = :user_id", nativeQuery = true)
	Review findReview(@Param("movie_id") Integer movieid,@Param("user_id") Integer userid);
	
	@Query(value="SELECT * FROM review where user_id = :user_id", nativeQuery = true)
	List<Review> findPersonalReview(@Param("user_id") Integer userid);

	@Transactional
	@Modifying
	@Query(value="UPDATE review SET review = :review WHERE movie_id = :movie_id and user_id = :user_id", nativeQuery = true)
	void changeReview(@Param("review") String review_text,@Param("movie_id") Integer movieid,@Param("user_id") Integer userid);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE review SET likeCount=likeCount+1 where id= :reviewId", nativeQuery = true)
	void incReviewCount(@Param("reviewId") Integer reviewId);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE review SET likeCount=likeCount-1 where id= :reviewId", nativeQuery = true)
	void decReviewCount(@Param("reviewId") Integer reviewId);
	
	@Query(value="SELECT reviews_id from ratereviews where User_accountId in (select user_id from review where movie_id = :movie_id and user_id= :user_id)", nativeQuery = true)
	List<Integer> findRatedReview(@Param("user_id") Integer userId,@Param("movie_id") Integer movieId);
	
	@Transactional
	@Modifying
	@Query(value="SET FOREIGN_KEY_CHECKS = 0;", nativeQuery = true)
	void deleteReview1();
	
	
	
	@Transactional
	@Modifying
	@Query(value="delete from ratereviews where reviews_id= :reviewId", nativeQuery = true)
	void deleteReview2(@Param("reviewId") Integer reviewId);
	
	@Transactional
	@Modifying
	@Query(value="delete from review where id= :reviewId", nativeQuery = true)
	void deleteReview3(@Param("reviewId") Integer reviewId);
	
	@Transactional
	@Modifying
	@Query(value="SET FOREIGN_KEY_CHECKS = 1", nativeQuery = true)
	void deleteReview4();
}
