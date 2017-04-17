package com.cedar.mta.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User createNewUser ( String firstName, String lastName, String email, String password) {
		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setEmail(email);
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		newUser.setCreationDate(date);
		newUser.setPword(password);
		userRepository.save(newUser);
		return newUser;
	}
}
