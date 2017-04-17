package com.cedar.mta.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import com.cedar.mta.entity.User;
import com.cedar.mta.service.UserService;

@Controller
public class SignupController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/sign-up")
	public String showSignUpPage() {
		return "sign-up";
	}

	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public ModelAndView handleSignUp(HttpSession session,ModelMap model, @RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String email, @RequestParam String password) {
		User currentUser = userService.createNewUser(firstName, lastName, email, password);
		session.setAttribute("user",currentUser);
		model.put("user", currentUser);
		System.out.println(currentUser.getFirstName());
		return new ModelAndView("redirect:"+"");
	}
}
