package com.cedar.mta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cedar.mta.service.ActorService;

@Controller
public class ActorController {

	@Autowired
	private ActorService actorService;
	
	@RequestMapping("/actors")
	public String actor(Model model){
		model.addAttribute("actors",actorService.findAll());
		return "actors";
	}
	
	@RequestMapping("/actors/{id}")
	public String detail(Model model,@PathVariable int id){
		model.addAttribute("actor",actorService.findById(id));
		return "actor-detail";
	}
}
