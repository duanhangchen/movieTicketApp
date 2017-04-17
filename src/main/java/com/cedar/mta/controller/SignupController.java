package com.cedar.mta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {

	@RequestMapping("/sign-up")
	public String showSignUpPage() {
		return "sign-up";
	}
	
	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String handleSignUp(ModelMap model, @RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String email,@RequestParam String password) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		return "index";
}
		

}
