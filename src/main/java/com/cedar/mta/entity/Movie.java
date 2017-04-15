package com.cedar.mta.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;



@Entity
public class Movie {
	public enum Category {upcoming, nowPlaying};
	public enum Genre {Action, Drama, Comedy, Kids, Horror, Romance, Scifi, Animated};
	
	@Id
	@GeneratedValue
	@Column(name = "movieId")
	private Integer id;
	
	@Column(name = "movieName")
	private String name;
	
	private Date releaseDate;
	
	@Column(name = "moviePoster")
	private String url;
	
	private String plot;
	
	private String fullPlot;
	
	private Double rating;
	
	private double boxOffice;
	
	private Integer numOfSales;

	@Enumerated(EnumType.STRING)
    private Category category;
	@Enumerated(EnumType.STRING)
	private Genre genre1;
	@Enumerated(EnumType.STRING)
	private Genre genre2;
	@Enumerated(EnumType.STRING)
	private Genre genre3;
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
	public String getFullPlot() {
		return fullPlot;
	}
	public void setFullPlot(String fullPlot) {
		this.fullPlot = fullPlot;
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Genre getGenre1() {
		return genre1;
	}
	public void setGenre1(Genre genre1) {
		this.genre1 = genre1;
	}
	public Genre getGenre2() {
		return genre2;
	}
	public void setGenre2(Genre genre2) {
		this.genre2 = genre2;
	}
	public Genre getGenre3() {
		return genre3;
	}
	public void setGenre3(Genre genre3) {
		this.genre3 = genre3;
	}
	
	//Getters Setters
	
}
