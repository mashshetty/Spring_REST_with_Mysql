package com.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;
	private String bname;
	private String bmodel;
	private String bprize;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(Long bid, String bname, String bmodel, String bprize) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bmodel = bmodel;
		this.bprize = bprize;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBmodel() {
		return bmodel;
	}
	public void setBmodel(String bmodel) {
		this.bmodel = bmodel;
	}
	public String getBprize() {
		return bprize;
	}
	public void setBprize(String bprize) {
		this.bprize = bprize;
	}
	@Override
	public String toString() {
		return "Bike [bid=" + bid + ", bname=" + bname + ", bmodel=" + bmodel + ", bprize=" + bprize + "]";
	}
	
	
	
	
}
