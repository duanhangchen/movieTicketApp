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
public class Movie {
	
	@Id
	@GeneratedValue
	@Column(name = "movieId")
	private Integer id;
	
	@Column(name = "movieName")
	private String name;
	
	private Integer category;
	
	private Date releaseDate;
	
	@Column(name = "moviePoster")
	private String url;
	
	private String plot;
	
	private Double rating;
	
	private double boxOffice;
	
	private Integer numOfSales;
	
	private String rated;
	
	private String runtime;
	
	private String trailer;
	
	private String actorsString;
	
	


	@ManyToMany
	@JoinTable(name="CastIn")
	private List<Actor> actors;
	
	@ManyToMany
	@JoinTable(name="MovieGenre")
	private List<Genre> genres;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public double getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(double boxOffice) {
		this.boxOffice = boxOffice;
	}

	public Integer getNumOfSales() {
		return numOfSales;
	}

	public void setNumOfSales(Integer numOfSales) {
		this.numOfSales = numOfSales;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getActorsString() {
		return actorsString;
	}

	public void setActorsString(String actorsString) {
		this.actorsString = actorsString;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	
	
	//Getters Setters
	
}
