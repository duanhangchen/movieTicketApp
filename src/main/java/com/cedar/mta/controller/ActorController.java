package com.cedar.mta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cedar.mta.entity.Actor;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.service.ActorService;
import com.cedar.mta.service.MovieService;

@Controller
public class ActorController {

	@Autowired
	private ActorService actorService;
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/actors")
	public String actor(Model model){
		model.addAttribute("actors",actorService.findAll());
		return "actors";
	}
	
	@RequestMapping("/actor/{id}")
	public String detail(Model model,@PathVariable int id){
		model.addAttribute("actor",actorService.findById(id));
		List<Movie> moviesDoneByActor = movieService.getMoviesByActorId(id);
		System.out.println("MOVIES DONE BY ACTOR "+ moviesDoneByActor.toString());
		model.addAttribute("moviesbyactor",movieService.getMoviesByActorId(id));
		return "actor-overview";
	}
}
