package com.cedar.mta.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class MovieAlert{
	
	@Id
	@GeneratedValue
	private Integer movieAlertId;
	
	private Integer userId;
	
	private Integer movieId;
	
	private String email;
	
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
	
}
