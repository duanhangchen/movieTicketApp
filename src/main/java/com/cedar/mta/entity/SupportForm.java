package com.cedar.mta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;


@Entity
public class SupportForm {
	
	@Id
	@GeneratedValue
	private Integer supportId;
	private String title;
	private String body;
	private String userEmail;
	public Integer getSupportId() {
		return supportId;
	}
	public void setSupportId(Integer supportId) {
		this.supportId = supportId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
