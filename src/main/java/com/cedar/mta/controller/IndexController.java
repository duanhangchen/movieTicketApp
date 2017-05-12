package com.cedar.mta.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.User;
import com.cedar.mta.service.MovieService;

@Controller
public class IndexController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/")
	public String index(Model model,HttpSession session){
		java.util.Date date = new java.util.Date();
		java.sql.Date todayDate = new java.sql.Date(date.getTime());
		User user = (User)session.getAttribute("user");
		if(user !=null){
			model.addAttribute("user",user);
		}
		model.addAttribute("featuredMovies",movieService.findFeaturedMovies());
		List<Movie> nowPlaying=movieService.findNowPlaying(todayDate);
		
		List<Movie> nowPlaying1=new ArrayList<Movie>();
		List<Movie> nowPlaying2=new ArrayList<Movie>();
		for(int i=0;i<5;i++){
			nowPlaying1.add(nowPlaying.get(i));
		}
		for(int i=5;i<12;i++){
			nowPlaying2.add(nowPlaying.get(i));
		}
		List<Movie> comingSoon=movieService.findComingSoon(todayDate);
		List<Movie> comingSoon1=new ArrayList<Movie>();
		List<Movie> comingSoon2=new ArrayList<Movie>();
		for(int i=0;i<5;i++){
			comingSoon1.add(comingSoon.get(i));
		}
		for(int i=5;i<12;i++){
			comingSoon2.add(comingSoon.get(i));
		}
		session.setAttribute("now_playing",nowPlaying1);
		session.setAttribute("now_playing2",nowPlaying2);
		session.setAttribute("coming_soon",comingSoon1);
		session.setAttribute("coming_soon2",comingSoon2);
		
		return "index";
	}
}