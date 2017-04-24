package com.cedar.mta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Actor;
import com.cedar.mta.repository.ActorRepository;

@Service
public class ActorService {
	@Autowired
	private ActorRepository actorRepository;	
	public List<Actor> findAll(){
		return actorRepository.findAll();
	}

	public Actor findById(int id) {
		return actorRepository.findOne(id);
	}
}
