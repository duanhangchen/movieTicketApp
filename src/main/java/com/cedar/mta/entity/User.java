package com.cedar.mta.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Table;
import javax.persistence.GeneratedValue;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer accountId;
	private String username;
	private String pword;
	private String email;
	private Date creationDate;
	private String firstName;
	private String lastName;
	private Date doB;
	private BigDecimal balance = BigDecimal.ZERO;
	private String role;
	
	@ManyToMany
	@JoinTable(name="MyMovies")
	private List<Movie> myMovies;
	
	@ManyToMany
	@JoinTable(name="MyTheaters")
	private List<Theater> theaters;
	
	@ManyToMany
	@JoinTable(name="RateReviews")
	private List<Review> reviews;
	
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDoB() {
		return doB;
	}
	public void setDoB(Date doB) {
		this.doB = doB;
	}
	
	public boolean isFavouriteMovie(Movie movie){
		return true;
	}
	
	public void addToMyMovie(Movie movie){
		myMovies.add(movie);
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
