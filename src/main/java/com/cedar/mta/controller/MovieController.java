package com.cedar.mta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cedar.mta.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/movies")
	public String movies(Model model){
		System.out.print("fff"+movieService.findAll());
		model.addAttribute("movies",movieService.findAll());
		return "movies";
	}
}
