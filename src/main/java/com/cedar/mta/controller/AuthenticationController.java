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
import com.cedar.mta.entity.User;
import com.cedar.mta.service.UserService;

@Controller
public class AuthenticationController {

	@Autowired
	private UserService userService;

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
			System.out.println("Hello" + user.getFirstName());
			session.setAttribute("user", user);
			return "redirect: ";
		}
	}
	@RequestMapping(value="/logout")
	public String handleUserLogout(HttpSession session, ModelMap model){
		session.removeAttribute("user");
		return "index";
	}
}