package com.demo.MTOEx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class library {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int b_id;
	private String b_name;
	@ManyToOne
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public library() {}
	public library(int b_id, String b_name) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
	}
	
}
