package com.cedar.mta.controller;

import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import com.cedar.mta.entity.User;
import com.cedar.mta.repository.GiftRepository;
import com.cedar.mta.service.GiftService;
import com.cedar.mta.service.MailService;
import com.cedar.mta.service.MovieService;

@Controller
public class IndexController {
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	
	
	
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private GiftService giftService;
	
	@Autowired
	private MailService mailService;
	
	@RequestMapping("/")
	public String index(Model model,HttpSession session){
		User user = (User)session.getAttribute("user");
		if(user !=null){
			model.addAttribute("user",user);
		}
		model.addAttribute("featuredMovies",movieService.findFeaturedMovies());
		return "index";
	}
	@RequestMapping("/giftcard")
	public String showGiftCard(Model model,HttpSession session){
		
		return "giftcard";
	}
	
	@RequestMapping(value = "/giftcard", method = RequestMethod.POST)
	public String handleSignUp(HttpSession session, ModelMap model, @RequestParam String giftTo,
			@RequestParam String giftFrom, @RequestParam String giftEmail, @RequestParam BigDecimal giftAmount,
			@RequestParam String giftMsg, @RequestParam String cardNumber) throws NoSuchAlgorithmException {
			
			model.addAttribute("gTo", giftTo);
			model.addAttribute("gFrom", giftFrom);
			model.addAttribute("gEmail", giftEmail);
			model.addAttribute("gAmount", giftAmount);
			model.addAttribute("gMsg", giftMsg);
			
			String cNumEnding = cardNumber.substring(cardNumber.length() - 4);
			model.addAttribute("cNumEnd", cNumEnding);
			
			String giftCode = randomAlphaNumeric(5);
			User user=(User) session.getAttribute("user");
			model.addAttribute("userEmail", user.getEmail());
			
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			model.addAttribute("date", dateFormat.format(date));
			
			System.out.println(giftAmount);			
			System.out.println(giftCode);
			System.out.println(user.getAccountId());		
			
			giftService.insertGiftCard(giftAmount, giftCode, user.getAccountId());
			
			mailService.sendMailForGiftCard(giftEmail, giftAmount, giftTo, giftFrom, giftCode, giftMsg);
			
		return "giftcard-confirmation";
	}
	
}