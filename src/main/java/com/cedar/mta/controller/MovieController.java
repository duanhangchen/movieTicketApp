package com.cedar.mta.controller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.User;
import com.cedar.mta.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/movies")
	public String movies(Model model){
		model.addAttribute("featuredMovies",movieService.findFeaturedMovies());
		return "movies";
	}
	
	@RequestMapping("/movies/{id}")
	public String detail(Model model,HttpSession session,@PathVariable int id){
		User user = (User)session.getAttribute("user");
		Movie movie = movieService.findById(id);
		if(user!=null){
			model.addAttribute("isFavourite",user.isFavouriteMovie(movie));
		}
		else{
			model.addAttribute("isFavourite",false);
		}
		model.addAttribute("movie",movieService.findById(id));
		return "movie-detail";
	}
	
	@RequestMapping(value = "/movies/{id}", method = RequestMethod.POST)
	public void handleFavouriteMovie(HttpSession session, ModelMap model, @RequestParam String favouriteMovie) {
		
		System.out.println(favouriteMovie);
		
	}
}
