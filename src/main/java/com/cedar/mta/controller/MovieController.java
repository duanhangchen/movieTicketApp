package com.cedar.mta.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Rating;
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.RatingRepository;
import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.RatingService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	@Autowired
	private RatingService ratingService;
	@Autowired
	private RatingRepository ratingRepository;
	
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
			Rating test=ratingService.findRatingScore(movie.getId(),user.getAccountId());
			if(test!=null){
				System.out.println("test123"+test.getScore());
				model.addAttribute("rating",test);
			}
		}
		model.addAttribute("movie",movieService.findById(id));
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
