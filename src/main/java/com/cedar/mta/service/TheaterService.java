package com.cedar.mta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Theater;
import com.cedar.mta.repository.TheaterRepository;

@Service
public class TheaterService {

	@Autowired
	private TheaterRepository theaterRepository;
	
	public List<Theater> findAll(){
		return theaterRepository.findAll();
	}

	public Theater findById(int id) {
		return theaterRepository.findOne(id);
	}
}
