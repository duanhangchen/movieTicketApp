package com.cedar.mta.controller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cedar.mta.entity.User;
import com.cedar.mta.service.MailService;
import com.cedar.mta.service.UserService;

@Controller
public class AuthenticationController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MailService mailService;

	@RequestMapping("/login")
	public String showLoginPage(Model model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(HttpSession session, ModelMap model, @RequestParam String name,
			@RequestParam String password) throws NoSuchAlgorithmException {
		User user = userService.findUserByEmail(name);
		if (!userService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		} else {

			session.setAttribute("user", user);
			return "redirect: ";
		}
	}
	
	
	@RequestMapping(value = "/fblogin", method = RequestMethod.POST)
	public @ResponseBody String handleFBLogin(HttpSession session, ModelMap model, @RequestParam String firstName,
			@RequestParam String lastName, @RequestParam String email) throws NoSuchAlgorithmException {
		User user = userService.findUserByEmail(email);
		if (user == null) {
			User newUser = userService.createNewUser(firstName, lastName, email, "");
			session.setAttribute("user", newUser);
			mailService.sendMailForSignUp(newUser.getEmail());
			return "success";
		} else {
			session.setAttribute("user", user);
			return "success";
		}
	}
	
	
	@RequestMapping(value="/logout")
	public String handleUserLogout(HttpSession session, ModelMap model){
		session.removeAttribute("user");
		return "redirect: ";
	}
}