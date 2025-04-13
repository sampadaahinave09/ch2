//Tp  demonstrate encapsulation 

package com.tnsifday1;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
//Entity class
public class Person {
	 private String name;
	 private int age;
	 private String city;
	 
	 
	 //Default constructor
	public Person() {
		super();
	// super = call super class contructor .Inherit parent class
		System.out.println("Default constructor");
	}
	//Parameterized class
	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	 
	 //When you work real project package is mo re important
	 //class cannot be private
	 //Superclass used in each class, in inheritance
	 //object is parent of all the java classes.
	 // used diff file to create main class/execute/driver class
	 //Above purpose is not different
		 
		 
	//tostring method is used your object in string format.
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	 }

