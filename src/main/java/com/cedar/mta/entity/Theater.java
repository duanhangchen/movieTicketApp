package com.cedar.mta.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Theater {

	@Id
	@GeneratedValue
	private Integer theaterId;
	
	private String theaterName;

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
	
}
