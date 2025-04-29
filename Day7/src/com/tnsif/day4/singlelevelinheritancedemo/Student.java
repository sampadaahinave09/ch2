package com.tnsif.day4.singlelevelinheritancedemo;
//Child class
public class Student extends Citizen  {
	private int rollno;
	private String gender;
	private String dept;
	
	//default method
	public Student() {
		super();
	}

	public Student(String adharno, String name, int phno, String address, int rollno, String gender, String dept) {
		super(adharno, name,phno, address);
		this.rollno = rollno;
		this.gender = gender;
		this.dept = dept;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", gender=" + gender + ", dept=" + dept + ", getAdharno()=" + getAdharno()
				+ ", getName()=" + getName() + ", getPhno()=" + getPhno() + ", getAddress()=" + getAddress() + "]";
	}
	
	
	
	
}
