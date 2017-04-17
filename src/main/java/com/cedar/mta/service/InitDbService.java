package com.cedar.mta.service;

import java.sql.Date;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import javax.xml.soap.Text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Actor;
import com.cedar.mta.entity.Movie;
import com.cedar.mta.entity.User;
import com.cedar.mta.repository.MovieRepository;
import com.cedar.mta.repository.UserRepository;
import com.cedar.mta.repository.ActorRepository;
import java.util.List;

@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private ActorRepository actorRepository;
	
	@PostConstruct
	public void init(){

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
		
		Actor jackHughman = new Actor();
		jackHughman.setName("Jack Hughman");
		@SuppressWarnings("deprecation")
		Date jackHughmanDoB = new Date(1968,10,12);
		jackHughman.setDoB(jackHughmanDoB);
		jackHughman.setBiography("A star in his native Australia thanks to his work on television and in musical theatre, actor Hugh Jackman became known to American audiences through his role as Logan/Wolverine in Bryan Singer's lavish adaptation of the popular Marvel comic X-Men (2000). Born of English parentage in Sydney on October 12, 1968, Jackman was raised as the youngest of five children....");
		actorRepository.save(jackHughman);
		
		
	}
}
