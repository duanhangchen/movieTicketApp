package com.cedar.mta.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Showing;
import com.cedar.mta.entity.User;
import com.cedar.mta.service.MailService;
import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.ShowingService;
import com.cedar.mta.service.TheaterService;
import com.cedar.mta.service.TransactionService;

@Controller
public class TheaterController {

	@Autowired
	private TheaterService theaterService;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ShowingService showingService;
	
	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private MailService mailService;
	
	
	@RequestMapping("/theaters")
	public String theater(Model model){
		model.addAttribute("theaters",theaterService.findAll());
		return "theaters";
	}
	
	@RequestMapping("/theaters/{id}")
	public String detail(Model model,@PathVariable Integer id){
		System.out.println("Not the right place");
		model.addAttribute("theater",theaterService.findById(id));
		List<Movie> movies=movieService.findMovieByTheater(id);
		String testDate="2017-05-17";
		for(int i=0;i<movies.size();i++){
			List<Showing> temp = showingService.findShowingByMovie(id,movies.get(i).getId(),testDate);
			for(int j=0;j<temp.size();j++){
				movies.get(i).addShowing(temp.get(j));
			}
		}
		model.addAttribute("moviesInThisTheater",movies);
		return "theater-detail";
	}
	
	
	@RequestMapping("/showing/{id}/{showDay}")
	public String ticketDate(Model model,@PathVariable Integer id,@PathVariable String showDay){
		System.out.println("POSTING");
		model.addAttribute("theater",theaterService.findById(id));
		List<Movie> movies=movieService.findMovieByTheater(id);
		String testDate="2017-05-17";
		for(int i=0;i<movies.size();i++){
			List<Showing> temp = showingService.findShowingByMovie(id,movies.get(i).getId(),showDay);
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
	
	@RequestMapping(value="/theaters/{id}/{showing_id}",method=RequestMethod.POST)
	public String payment(Model model,@PathVariable Integer id,@PathVariable Integer showing_id,@RequestParam int adult,@RequestParam int senior,@RequestParam int child){
		
		System.out.println(adult+""+senior+child);
		model.addAttribute("adult",adult);
		model.addAttribute("senior",senior);
		model.addAttribute("child",child);
		model.addAttribute("theater",theaterService.findById(id));
		model.addAttribute("showing",showingService.findById(showing_id));
		return "payment";
	}
	
	@RequestMapping(value="/theaters/{id}/{showing_id}/confirmation/{adult}/{senior}/{child}",method=RequestMethod.POST)
	public String confirmation(HttpSession session,Model model,@PathVariable Integer id,@PathVariable Integer showing_id,@PathVariable Integer adult,@PathVariable Integer senior,@PathVariable Integer child,@RequestParam String giftFrom,@RequestParam String giftEmail,@RequestParam String cardNumber){
		User user = (User) session.getAttribute("user");
		model.addAttribute("theater",theaterService.findById(id));
		model.addAttribute("showing",showingService.findById(showing_id));
		model.addAttribute("gFrom", giftFrom);
		model.addAttribute("gEmail", giftEmail);
		String cNumEnding = cardNumber.substring(cardNumber.length() - 4);
		model.addAttribute("cNumEnd", cNumEnding);	
		model.addAttribute("userEmail", user.getEmail());
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		DateFormat dbFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		model.addAttribute("date", dateFormat.format(date));
		
		
		double totalPrice=adult*11.99+senior*10.49+child*8.99;
		transactionService.addTransaction(user.getAccountId(), totalPrice, dbFormat.format(date));
		mailService.sendMailForTicket(giftEmail, user.getLastName(), totalPrice, adult, senior, child, theaterService.findById(id).getName(), showingService.findById(showing_id).getStartTime());
		return "confirmation";
	}

}







