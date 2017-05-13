package com.cedar.mta.entity;

import java.sql.Date;
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
public class Ads {
	@Id
	@GeneratedValue
	private Integer adsId;
	private String adsImageUrl;
	private String adsUrl;
	
	public Integer getAdsId() {
		return adsId;
	}
	public void setAdsId(Integer adsId) {
		this.adsId = adsId;
	}
	public String getAdsImageUrl() {
		return adsImageUrl;
	}
	public void setAdsImageUrl(String adsImageUrl) {
		this.adsImageUrl = adsImageUrl;
	}
	public String getAdsUrl() {
		return adsUrl;
	}
	public void setAdsUrl(String adsUrl) {
		this.adsUrl = adsUrl;
	}
}
