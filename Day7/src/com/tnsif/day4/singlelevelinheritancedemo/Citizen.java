package com.tnsif.day4.singlelevelinheritancedemo;

public class Citizen {
	private String adharno;
	private String name;
	private int phno;
	private String address;
	
	//default constructor
	public Citizen() {
		System.out.println("Default constructor");
	}
	//parametrized
	public Citizen(String adharno, String name, int phno, String address) {
		this.adharno = adharno;
		this.name = name;
		this.phno = phno;
		this.address = address;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
