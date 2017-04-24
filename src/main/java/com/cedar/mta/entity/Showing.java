package com.cedar.mta.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.GeneratedValue;


@Entity
public class Showing {
	@Id
	@GeneratedValue
	private Integer showingId;	
	private Date showingDate;
	private Time startTime;
	
	@ManyToOne
	@JoinColumn(name = "movieId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Movie movie;	
	@ManyToOne
	@JoinColumn(name = "screenId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Screen screenId;

	public Integer getShowingId() {
		return showingId;
	}
	public void setShowingId(Integer showingId) {
		this.showingId = showingId;
	}
	public Date getShowingDate() {
		return showingDate;
	}
	public void setShowingDate(Date showingDate) {
		this.showingDate = showingDate;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Screen getScreenId() {
		return screenId;
	}
	public void setScreenId(Screen screenId) {
		this.screenId = screenId;
	}	
}
