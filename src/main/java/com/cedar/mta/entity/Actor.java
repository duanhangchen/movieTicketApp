package com.cedar.mta.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Actor {

	@Id
	@GeneratedValue
	private Integer actorId;
	
	private String lastName;
	
	private String firstName;
	
	private Date doB;
	
	private String biography;
	
	private String awards;

	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDoB() {
		return doB;
	}

	public void setDoB(Date doB) {
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
