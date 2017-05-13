package com.cedar.mta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Showing;
import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.ShowingService;
import com.cedar.mta.service.TheaterService;

@Controller
public class TheaterController {

	@Autowired
	private TheaterService theaterService;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ShowingService showingService;
	
	@RequestMapping("/theaters")
	public String theater(Model model){
		model.addAttribute("theaters",theaterService.findAll());
		return "theaters";
	}
	
	@RequestMapping("/theaters/{id}")
	public String detail(Model model,@PathVariable Integer id){
		model.addAttribute("theater",theaterService.findById(id));
		java.util.Date date = new java.util.Date();
		date.setDate(17);
		java.sql.Date todayDate = new java.sql.Date(date.getTime());
		List<Movie> movies=movieService.findMovieByTheater(id);
		for(int i=0;i<movies.size();i++){
			List<Showing> temp = showingService.findShowingByMovie(id,movies.get(i).getId(),todayDate);
			for(int j=0;j<temp.size();j++){
				movies.get(i).addShowing(temp.get(j));
			}
		}
		model.addAttribute("moviesInThisTheater",movies);
		return "theater-detail";
	}

	@RequestMapping("/theaters/{id}/{showing_id}")
	public String checkOut(Model model,@PathVariable Integer id,@PathVariable Integer showing_id){
		model.addAttribute("theater",theaterService.findById(id));
		model.addAttribute("showing",showingService.findById(showing_id));
		return "check-out";
	}

}







