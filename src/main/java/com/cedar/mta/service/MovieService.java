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
	public List<Movie> findFeaturedMovies(){
		return movieRepository.findFeaturedMovies();
	}
	public List<Movie> getMoviesByActorId(int id){
		return movieRepository.findMoviesByActorId(id);
	}
	
	public List<Movie> findMoviesByGenre(String genre){
		return movieRepository.findMoviesByGenre(genre);
	}
	
	public List<Movie> findComingSoon(java.sql.Date date){
		return movieRepository.findComingSoon(date);
	}
	
	public List<Movie> findNowPlaying(java.sql.Date date){
		return movieRepository.findNowPlaying(date);
	}
	
	public List<Movie> findComingSoonAndGenre(java.sql.Date date,String genre){
		return movieRepository.findComingSoonAndGenre(date, genre);
	}
	
	public List<Movie> findNowPlayingAndGenre(java.sql.Date date,String genre){
		return movieRepository.findNowPlayingAndGenre(date, genre);
	}

}
