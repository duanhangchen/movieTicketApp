package com.cedar.mta.entity;

import java.sql.Date;

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
public class Screen {
	public enum ScreenType {regular, threeD, imax};
	@Id
	@GeneratedValue
	private Integer screenId;	
	private Integer availableSeats;	
	@ManyToOne
	@JoinColumn(name = "theaterId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Theater theater;

	@Enumerated(EnumType.STRING)
	private ScreenType screenType;

	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Integer getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Theater getTheater() {
		return theater;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	public ScreenType getScreenType() {
		return screenType;
	}
	public void setScreenType(ScreenType screenType) {
		this.screenType = screenType;
	}	
}
