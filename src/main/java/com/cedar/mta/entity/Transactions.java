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
public class Transactions {
	@Id
	@GeneratedValue
	private Integer transactionId;	
	private Date transactionDate;
	private Double transactionAmount;	
	@ManyToOne
	@JoinColumn(name = "accountId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User account;

	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public User getAccount() {
		return account;
	}
	public void setAccount(User account) {
		this.account = account;
	}
}
