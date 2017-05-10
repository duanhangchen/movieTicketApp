package com.cedar.mta.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public Boolean validateUser(String email, String password) throws NoSuchAlgorithmException {
		User user = findUserByEmail(email);
		if (user != null){
			String hashedPassword = hashPassword(password);
			return user.getPword().equals(hashedPassword);
		}
		return false;
	}

	public User createNewUser(String firstName, String lastName, String email, String password)
			throws NoSuchAlgorithmException {
		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setEmail(email);
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		newUser.setCreationDate(date);
		String hashedPassword = hashPassword(password);
		newUser.setPword(hashedPassword);
		userRepository.save(newUser);
		return newUser;
	}

	public String hashPassword(String password) throws NoSuchAlgorithmException {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(password.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	

}
