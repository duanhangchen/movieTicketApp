package com.cedar.mta.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;


@Entity
public class Theater {
	@Id
	@GeneratedValue
	private Integer theaterId;	
	private String theaterName;	
	private String AddressLine;
	private String city;
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String zipcode;
	
	public Integer getId() {
		return theaterId;
	}
	public void setId(Integer theaterId) {
		this.theaterId = theaterId;
	}
	public String getName() {
		return theaterName;
	}
	public void setName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getAddressLine() {
		return AddressLine;
	}
	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
