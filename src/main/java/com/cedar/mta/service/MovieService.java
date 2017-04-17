package com.cedar.mta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Movie;
import com.cedar.mta.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> findAll(){
		return movieRepository.findAll();
	}

	public Movie findById(int id) {
		return movieRepository.findOne(id);
	}
	
}
