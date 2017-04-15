package com.cedar.mta.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.GeneratedValue;


@Entity
public class Trailer {

	@Id
	@GeneratedValue
	private Integer trailerId;
	
	private String trailerUrl;
	
	
	@ManyToOne
	@JoinColumn(name = "movieId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Movie movie;


	public Integer getTrailerId() {
		return trailerId;
	}


	public void setTrailerId(Integer trailerId) {
		this.trailerId = trailerId;
	}


	public String getTrailerUrl() {
		return trailerUrl;
	}


	public void setTrailerUrl(String trailerUrl) {
		this.trailerUrl = trailerUrl;
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
}
