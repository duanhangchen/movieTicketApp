package com.cedar.mta.controller;

import java.util.ArrayList;
import java.util.List;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;


import com.cedar.mta.entity.Movie;

import com.cedar.mta.entity.Ads;

import com.cedar.mta.entity.Ads;

import com.cedar.mta.entity.Movie;

import com.cedar.mta.entity.User;
import com.cedar.mta.repository.GiftRepository;
import com.cedar.mta.service.AdService;
import com.cedar.mta.service.GiftService;
import com.cedar.mta.service.MailService;
import com.cedar.mta.service.MovieService;
import com.cedar.mta.service.SupportFormService;
import com.cedar.mta.service.TheaterService;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller
public class IndexController {
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	
	
	@Autowired
	private AdService adService;


	@Autowired
	private MovieService movieService;
	
	@Autowired
	private SupportFormService supportFormService;

	@Autowired
	private GiftService giftService;

	@Autowired
	private MailService mailService;
	
	@Autowired
	private TheaterService theaterService;
	
	public boolean isNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	}  

	@RequestMapping("/")
	public String index(Model model, HttpSession session) throws IOException {
		java.util.Date date = new java.util.Date();
		java.sql.Date todayDate = new java.sql.Date(date.getTime());
		User user = (User) session.getAttribute("user");
		if (user != null) {
			model.addAttribute("user", user);
		}
		model.addAttribute("featuredMovies", movieService.findFeaturedMovies());
		List<Movie> nowPlaying = movieService.findNowPlaying(todayDate);

		List<Movie> nowPlaying1 = new ArrayList<Movie>();
		List<Movie> nowPlaying2 = new ArrayList<Movie>();
		for (int i = 0; i < 5; i++) {
			nowPlaying1.add(nowPlaying.get(i));
		}
		for (int i = 5; i < 12; i++) {
			nowPlaying2.add(nowPlaying.get(i));
		}

		model.addAttribute("advertisement", adService.findAllAds());
		model.addAttribute("featuredMovies",movieService.findFeaturedMovies());
		
		List<Ads> adList = adService.findAllAds();
		for(int i=0;i<adList.size(); i++){
			System.out.println(adList.get(i).getAdsImageUrl());
			System.out.println(adList.get(i).getAdsUrl());
		}
		

		List<Movie> comingSoon = movieService.findComingSoon(todayDate);
		List<Movie> comingSoon1 = new ArrayList<Movie>();
		List<Movie> comingSoon2 = new ArrayList<Movie>();
		for (int i = 0; i < 5; i++) {
			comingSoon1.add(comingSoon.get(i));
		}
		for (int i = 5; i < 12; i++) {
			comingSoon2.add(comingSoon.get(i));
		}
		session.setAttribute("now_playing", nowPlaying1);
		session.setAttribute("now_playing2", nowPlaying2);
		session.setAttribute("coming_soon", comingSoon1);
		session.setAttribute("coming_soon2", comingSoon2);


		
		String surl = "https://ipinfo.io/json";
		URL url = new URL(surl);
		HttpURLConnection request = (HttpURLConnection) url.openConnection();
	    request.connect();
	    JsonParser jp = new JsonParser(); 
	    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); 
	    JsonObject rootobj = root.getAsJsonObject();
	    int postal = rootobj.get("postal").getAsInt();
	    String city =rootobj.get("city").getAsString()+", "+rootobj.get("region").getAsString()+", "+postal;
	    String coordinate = rootobj.get("loc").getAsString();
	    session.setAttribute("nearbyTheaters", theaterService.findNearbyTheaters(postal));
	    session.setAttribute("location", city);

	    session.setAttribute("coordinate", coordinate);
	    

		return "index";
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String submitSupport(Model model,HttpSession session,@RequestParam String title,@RequestParam String body){
		User user = (User) session.getAttribute("user");
		supportFormService.addSupport(body, title, user.getEmail());
		return "redirect: ";
	}
	
	
	@RequestMapping(value = "/searchResult", method = RequestMethod.POST)
	public String searchResult(Model model,HttpSession session,@RequestParam String search){
		User user = (User) session.getAttribute("user");
		System.out.println(search);
		model.addAttribute("keyword", search);
		model.addAttribute("searchMovie",movieService.searchMovie(search));
		if(isNumeric(search)){
			int zip=Integer.parseInt(search);
			System.out.println("zip:"+zip);
			model.addAttribute("searchZip",theaterService.findNearbyTheaters(zip));
		}
		else{
			model.addAttribute("searchZip",theaterService.findCityState(search));
		}
		return "search-result";
	}

	@RequestMapping("/giftcard")
	public String showGiftCard(Model model, HttpSession session) {

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
		User user = (User) session.getAttribute("user");
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