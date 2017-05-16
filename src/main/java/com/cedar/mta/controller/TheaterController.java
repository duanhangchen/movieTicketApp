package com.cedar.mta.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Showing;

import com.cedar.mta.entity.Theater;

import com.cedar.mta.entity.User;
import com.cedar.mta.repository.UserRepository;

import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.ShowingService;
import com.cedar.mta.service.TheaterService;

@Controller
public class TheaterController {

	@Autowired
	private TheaterService theaterService;
	
	@Autowired
	private UserRepository userRepository;
	
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
	public String detail(HttpSession session,Model model,@PathVariable Integer id){
		
		User user=(User) session.getAttribute("user");
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
		if(user!=null){
			
			Integer isFavourite = userRepository.findUserFavouriteTheater(id,user.getAccountId());
			if(isFavourite == null){
				model.addAttribute("favouriteTheatre", "white");
			}
			else {
				model.addAttribute("favouriteTheatre", "red");
			}
			
		}
		
		model.addAttribute("moviesInThisTheater",movies);
		Theater theaterTemp = theaterService.findById(id);
		String addressInitial = theaterTemp.getAddressLine() + " " 
				+ theaterTemp.getCity() + " " 
				+ theaterTemp.getState() + " "
				+ theaterTemp.getZipcode();
		String address = theaterTemp.getAddressLine().replaceAll(" ", "+");
		String address2 = theaterTemp.getCity().replaceAll(" ", "+");
		String addressFinal = address + "+" + address2 + "+" + theaterTemp.getState() + "+" + theaterTemp.getZipcode();
		System.out.println(addressFinal);
		model.addAttribute("theaterAddressDirection",addressFinal);
		model.addAttribute("theaterAddress",addressInitial);
		
		return "theater-detail";
	}

	@RequestMapping("/theaters/{id}/{showing_id}")
	public String checkOut(Model model,@PathVariable Integer id,@PathVariable Integer showing_id){
		model.addAttribute("theater",theaterService.findById(id));
		model.addAttribute("showing",showingService.findById(showing_id));
		return "check-out";
	}
	
	
	@RequestMapping(value="/theatres/{id}/toggleFavourite",method=RequestMethod.POST)
	public @ResponseBody String toggleFavourite(Model model,HttpSession session,@PathVariable int id,@RequestParam String value){
		User user=(User) session.getAttribute("user");
		System.out.println("Toggle Theatre"+value);
		if(user!=null){
			if(value.equals("red")){
				
				userRepository.addTheatreToUser(user.getAccountId(), id);
			}
			else if(value.equals("white")){
				userRepository.deleteTheatreFromUser(user.getAccountId(), id);
			}
		}
		return "success";
	}

}







