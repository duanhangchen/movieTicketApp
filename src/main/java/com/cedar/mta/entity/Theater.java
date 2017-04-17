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
	
	@ManyToMany(mappedBy="theaters")
	private List<Accounts> accounts;

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
