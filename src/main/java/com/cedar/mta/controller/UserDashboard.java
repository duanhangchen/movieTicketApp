package com.cedar.mta.controller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cedar.mta.entity.User;
import com.cedar.mta.service.MailService;
import com.cedar.mta.service.UserService;

@Controller
public class UserDashboard {

	@Autowired
	private UserService userService;

	@Autowired
	private MailService mailService;
	

	@RequestMapping("/user-dashboard")
	public String showSignUpPage() {
		return "user-dashboard";
	}

//	@RequestMapping(value = "/user-dashboard", method = RequestMethod.POST)
//	public String handleSignUp(HttpSession session, ModelMap model, @RequestParam String firstName,
//			@RequestParam String lastName, @RequestParam String email, @RequestParam String password) throws NoSuchAlgorithmException {
//		User currentUser = userService.createNewUser(firstName, lastName, email, password);
//		session.setAttribute("user",currentUser);
//		mailService.sendMailForSignUp(currentUser.getEmail());
//		return "redirect: ";
//	}

	
}
