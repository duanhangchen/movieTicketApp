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
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.RatingRepository;
import com.cedar.mta.service.ActorService;
import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.RatingService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ActorService actorService;
	
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
		List<Actor> actors = actorService.findActor(id);
		System.out.println("Actors"+ actors.toString());
		session.setAttribute("cast",actorService.findActor(id));
		return "movie-detail";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/movies/rating/{id}/{score}",method=RequestMethod.POST)
	public void ratings(Model model,HttpSession session,@PathVariable int id,@PathVariable int score){
		System.out.println(id);
		System.out.println(score);
		User user=(User) session.getAttribute("user");
		Rating test=ratingService.findRatingScore(id,user.getAccountId());
		if(test==null){
			Rating rating=new Rating();
			Movie movie=movieService.findById(id);
			rating.setUser(user);
			rating.setMovie(movie);
			rating.setScore(score);
			ratingRepository.save(rating);
		}
		else{
			ratingService.updateRatingScore(id,user.getAccountId(),score);
		}
	}
}
