package com.cedar.mta.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.cedar.mta.entity.User;
import com.cedar.mta.service.MovieService;

@Controller
public class IndexController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/")
	public String index(Model model,HttpSession session){
		User user = (User)session.getAttribute("user");
		if(user !=null){
			model.addAttribute("user",user);
		}
		model.addAttribute("movies",movieService.findAll());
		return "index";
	}
}