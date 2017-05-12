package com.cedar.mta.entity;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;



@Entity
public class Genre {
	
	@Id
	@GeneratedValue
	@Column(name = "genreId")
	private Integer id;	
	@Column(name = "genreType")
	private String type;		
	@ManyToMany(mappedBy="genres")
	private List<Movie> movies;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
}
