package com.tnsif.day7.multileveldemo;

//Parent class
public class Person {
	private String name;
	private int age;
	private String add;
	public Person() {
		super();
	}
	public Person(String name, int age, String add) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", add=" + add + "]";
	}
	
}
