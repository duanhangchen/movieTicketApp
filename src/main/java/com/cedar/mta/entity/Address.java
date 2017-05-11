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
public class Address {

	@Id
	@GeneratedValue
	private Integer addressId;	
	private String addressLineOne;	
	private String addressLineTwo;	
	private String city;	
	private String stateProvReg;	
	private String zipPostal;
	
	@ManyToOne
	@JoinColumn(name = "theaterId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Theater theater;

	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}	
	public String getAddressLineOne() {
		return addressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}	
	public String getAddressLineTwo() {
		return addressLineTwo;
	}
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	public String getStateProvReg() {
		return stateProvReg;
	}
	public void setStateProvReg(String stateProvReg) {
		this.stateProvReg = stateProvReg;
	}	
	public String getZipPostal() {
		return zipPostal;
	}
	public void setZipPostal(String zipPostal) {
		this.zipPostal = zipPostal;
	}	
	public Theater getTheater() {
		return theater;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
}
