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
public class Photo {

	@Id
	@GeneratedValue
	private Integer photoId;	
	private String photoUrl;	
	
	@ManyToOne
	@JoinColumn(name = "movieId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Movie movie;	
	@ManyToOne
	@JoinColumn(name = "actorId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Actor actor;
	
	public Integer getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}	
}
