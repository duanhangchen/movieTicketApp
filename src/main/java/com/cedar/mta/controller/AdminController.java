package com.cedar.mta.controller;

import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cedar.mta.entity.GiftCard;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.MovieAlert;
import com.cedar.mta.entity.NewsLetter;
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.GiftRepository;
import com.cedar.mta.repository.MovieAlertRepository;
import com.cedar.mta.repository.NewsLetterRepository;

import com.cedar.mta.repository.TheaterRepository;
import com.cedar.mta.service.GiftService;
import com.cedar.mta.service.MailService;
import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.NewsLetterService;
import com.cedar.mta.service.ReviewService;
import com.cedar.mta.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private TheaterRepository theaterRepository;

	@Autowired
	private ReviewService reviewService;

	@Autowired
	private MailService mailService;
	
	@Autowired
	private MovieService movieService;

	@Autowired
	private NewsLetterService newsService;

	@Autowired
	private NewsLetterRepository newsRepository;
	
	@Autowired
	private MovieAlertRepository alertRepository;

	
	@RequestMapping("/sendnewsletter")
	public String sendNewsLetter(Model model, HttpSession session) {

		User user = (User) session.getAttribute("user");
		
		if(user!=null){
			
			List<NewsLetter> subscribers = newsRepository.findSubscribers();
			
			for(int j=0;j<subscribers.size();j++){
				
			mailService.sendNewLetter(subscribers.get(j).getEmail());
			}
		}
		return "redirect:/admin-dashboard";
	}
	
	@RequestMapping("/sendmoviealert/{id}")
	public String sendmoviealert(Model model, HttpSession session, @PathVariable Integer id) {

		User user = (User) session.getAttribute("user");
		
		Movie movie=movieService.findById(id);
		
		if(user!=null){
			
			List<MovieAlert> subscribers = alertRepository.findMoviesAlertByMovie(id);
			
			for(int j=0;j<subscribers.size();j++){
				
				System.out.println("I am calling Mail Service");
				
				mailService.sendMovieAlert(subscribers.get(j).getEmail(),movie.getName());
			}
		}
		return "redirect:/admin-dashboard";
	}
	
	
	@RequestMapping("/admin-dashboard")
	public String showAdminDashboardPage(Model model, HttpSession session) {

		User user = (User) session.getAttribute("user");

		if(user!=null){
			
			model.addAttribute("userreviews", reviewService.findPersonalReview(user.getAccountId()));


			model.addAttribute("userTheaters", theaterRepository.findPersonalTheater(user.getAccountId()));

			BigDecimal balance = userService.getBalanceById(user.getAccountId());
			model.addAttribute("balance", balance);

			NewsLetter news = newsRepository.findOne(user.getAccountId());
			if (news != null) {
				model.addAttribute("subscribed", true);
			} else {
				System.out.println("Hello Im in newletter");
				model.addAttribute("subscribed", false);
			}
			
		}
		
		else{
			System.out.println("User Is NULL");
		}
		

		return "admin-dashboard";
	}



}
