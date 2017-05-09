package com.cedar.mta.service;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Rating;
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.RatingRepository;

@Service
public class RatingService {
	@Autowired
	private RatingRepository ratingRepository;
	
	@Autowired
	private UserService userService;
	
	public Rating findOne(int id) {
		return ratingRepository.findOne(id);
	}
	
	public List<Rating> findByUser(User user) {
		return ratingRepository.findByUser(user);
	}
	
	public Rating findRatingScore(Integer movie_id,Integer user_id) {
		return ratingRepository.findRatingScore(movie_id,user_id);
	}
	
	public void updateRatingScore(Integer movie_id,Integer user_id,int score){
		System.out.println(movie_id);
		System.out.println(user_id);
		System.out.print(score);
		ratingRepository.changeRating(score,movie_id,user_id);
	}
	
	public void delete(int id,HttpSession session){
		Rating rating = findOne(id);
		User user=(User) session.getAttribute("user");
		if(user==rating.getUser()){
			ratingRepository.delete(id);
		}
	}


}
