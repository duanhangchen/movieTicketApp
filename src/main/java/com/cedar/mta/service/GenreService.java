package com.cedar.mta.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cedar.mta.entity.Genre;
import com.cedar.mta.repository.GenreRepository;

@Service
public class GenreService {
	@Autowired
	private GenreRepository genreRepository;
	
	public List<Genre> findGenres(){
		return genreRepository.findAll();
	}
}
