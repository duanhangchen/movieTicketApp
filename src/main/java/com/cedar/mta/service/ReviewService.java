package com.cedar.mta.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Review;
import com.cedar.mta.repository.RatingRepository;
import com.cedar.mta.repository.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private UserService userService;
	
	public Review findReview(Integer movieid,Integer userid){
		return reviewRepository.findReview(movieid, userid);
	}
	
	public List<Review> findReviews(Integer movie_id){
		return reviewRepository.findReviews(movie_id);
	}
	
	public void changeReview(String review,Integer movie_id,Integer user_id){
		reviewRepository.changeReview(review,movie_id,user_id);
	}

}