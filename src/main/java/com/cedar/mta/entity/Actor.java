package com.cedar.mta.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;


@Entity
public class Actor {

	@Id
	@GeneratedValue
	private Integer actorId;
	
	private String name;
	
	private Calendar doB;
	
	@Lob
	@Column
	private String biography;
	
	private String awards;
	
	@ManyToMany(mappedBy="actors")
	private List<Movie> movies;

	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getDoB() {
		return doB;
	}

	public void setDoB(Calendar doB) {
		this.doB = doB;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getAwards() {
		return awards;
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}
}
