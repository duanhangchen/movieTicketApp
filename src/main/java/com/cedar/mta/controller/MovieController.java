package com.cedar.mta.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import com.cedar.mta.entity.Actor;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.User;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Rating;
import com.cedar.mta.entity.Review;
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.RatingRepository;

import com.cedar.mta.service.ActorService;

import com.cedar.mta.repository.ReviewRepository;
import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.RatingService;
import com.cedar.mta.service.ReviewService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ActorService actorService;
	
	@Autowired
	private RatingService ratingService;
	
	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private RatingRepository ratingRepository;
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	@RequestMapping("/movies")
	public String movies(Model model){
		model.addAttribute("featuredMovies",movieService.findFeaturedMovies());
		return "movies";
	}
	
	@RequestMapping("/movies/{id}")
	public String detail(Model model,@PathVariable int id,HttpSession session){
		User user=(User) session.getAttribute("user");
		Movie movie=movieService.findById(id);
		if(user!=null){
			Review personalReview=reviewService.findReview(movie.getId(),user.getAccountId());
			Rating test=ratingService.findRatingScore(movie.getId(),user.getAccountId());
			if(test!=null){
				model.addAttribute("rating",test);
			}
			model.addAttribute("review",personalReview);
		}
		model.addAttribute("movie",movieService.findById(id));
		model.addAttribute("reviews",reviewService.findReviews(id));
		List<Actor> actors=actorService.findActor(id);
		model.addAttribute("cast",actors);
		return "movie-detail";
	}
	
	@RequestMapping(value="/movies/{id}", method=RequestMethod.POST)
	public String handleReview(Model model,@PathVariable int id,HttpSession session,@RequestParam String reviewText){
		User user=(User) session.getAttribute("user");
		Movie movie=movieService.findById(id);	
		if(user!=null){
			Review personalReview=reviewService.findReview(movie.getId(),user.getAccountId());
			Rating test=ratingService.findRatingScore(movie.getId(),user.getAccountId());
			if(test!=null){
				model.addAttribute("rating",test);
			}
			if(personalReview==null){
				Review review=new Review();
				review.setMovie(movie);
				review.setUser(user);
				review.setReview(reviewText);
				reviewRepository.save(review);
				model.addAttribute("review",review);
			}
			else{
				reviewService.changeReview(reviewText,movie.getId(),user.getAccountId());
				Review newReview=reviewService.findReview(movie.getId(),user.getAccountId());
				model.addAttribute("review",newReview);
			}
		}
		else{
			return "redirect:/login";
		}
		model.addAttribute("movie",movieService.findById(id));
		List<Actor> actors = actorService.findActor(id);
		System.out.println("Actors"+ actors.toString());
		session.setAttribute("cast",actorService.findActor(id));
		model.addAttribute("reviews",reviewService.findReviews(id));
		return "movie-detail";
	}
	
	

	@RequestMapping(value="/movies/rating/{id}/{score}",method=RequestMethod.POST)
	public @ResponseBody String ratings(Model model,HttpSession session,@PathVariable int id,@PathVariable int score){
		User user=(User) session.getAttribute("user");
		if(user!=null){
			Rating test=ratingService.findRatingScore(id,user.getAccountId());
			if(test==null){
				Rating rating=new Rating();
				Movie movie=movieService.findById(id);
				rating.setUser(user);
				rating.setMovie(movie);
				rating.setScore(score);
				ratingRepository.save(rating);
				return "success";
			}
			else{
				ratingService.updateRatingScore(id,user.getAccountId(),score);
				return "success";
			}
		}
		else{
			return "FAIL";
		}
	}
}
