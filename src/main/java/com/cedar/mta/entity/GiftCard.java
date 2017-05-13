package com.cedar.mta.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Table;
import javax.persistence.GeneratedValue;

@Entity
public class GiftCard {
	@Id
	@GeneratedValue
	private Integer giftId;
	private String giftCode;
	private BigDecimal giftAmount;
	
	@ManyToOne
	@JoinColumn(name = "accountId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;

	public Integer getGiftId() {
		return giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public String getGiftCode() {
		return giftCode;
	}

	public void setGiftCode(String giftCode) {
		this.giftCode = giftCode;
	}

	public BigDecimal getGiftAmount() {
		return giftAmount;
	}

	public void setGiftAmount(BigDecimal giftAmount) {
		this.giftAmount = giftAmount;
	}
	
}
