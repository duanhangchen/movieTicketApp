package com.cedar.mta.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	 
	public boolean validateUser(String user, String password) {
         return user.equalsIgnoreCase("sanchay26@gmail.com") && password.equals("hello");
     }
}
