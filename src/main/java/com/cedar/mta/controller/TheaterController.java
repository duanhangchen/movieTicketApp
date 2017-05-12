package com.cedar.mta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cedar.mta.service.TheaterService;

@Controller
public class TheaterController {

	@Autowired
	private TheaterService theaterService;
	
	@RequestMapping("/theaters")
	public String theater(Model model){
		model.addAttribute("theaters",theaterService.findAll());
		return "theaters";
	}
	
	@RequestMapping("/theaters/{id}")
	public String detail(Model model,@PathVariable int id){
		model.addAttribute("theater",theaterService.findById(id));
		return "theater-detail";
	}
}
