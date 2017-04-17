package com.cedar.mta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cedar.mta.service.MovieService;

@Controller
public class IndexController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("movies",movieService.findAll());
		return "index";
	}
}