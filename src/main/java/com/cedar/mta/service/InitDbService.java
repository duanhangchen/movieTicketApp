package com.cedar.mta.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.Role;
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.MovieRepository;
import com.cedar.mta.repository.RoleRepository;
import com.cedar.mta.repository.UserRepository;
import java.util.List;

@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@PostConstruct
	public void init(){
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		userAdmin.setEmail("duan@gmail.com");
		userAdmin.setPassword("abc123");
		List<Role> roles=new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Movie batman = new Movie();
		batman.setName("Batman");
		batman.setUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTYwNjAyODIyMF5BMl5BanBnXkFtZTYwNDMwMDk2._V1_SX300.jpg");
		movieRepository.save(batman);
		
		Movie logan= new Movie();
		logan.setName("Logan");
		logan.setUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMjI1MjkzMjczMV5BMl5BanBnXkFtZTgwNDk4NjYyMTI@._V1_SX300.jpg");
		movieRepository.save(logan);
		
		Movie getOut = new Movie();
		getOut.setName("Get Out");
		getOut.setUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BNTE2Nzg1NjkzNV5BMl5BanBnXkFtZTgwOTgyODMyMTI@._V1_SX300.jpg");
		movieRepository.save(getOut);
		
		Movie theGreatWall = new Movie();
		theGreatWall.setName("The Great Wall");
		theGreatWall.setUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMjA3MjAzOTQxNF5BMl5BanBnXkFtZTgwOTc5OTY1OTE@._V1_SX300.jpg");
		movieRepository.save(theGreatWall);
		
		
		
	}
}
