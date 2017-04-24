package com.cedar.mta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String detail(Model model,@PathVariable int id){
		model.addAttribute("movie",movieService.findById(id));
		return "movie-detail";
	}
}
