package com.tnsif.day7.multileveldemo;
//Grand child
public class Manager extends Employee{
	private int teamsize;
	private String skills;
	public Manager() {
		super();
	}
	public Manager(String name, int age, String add, int empid, float salary, String dept, int teamsize, String skills) {
		super(name, age, add, empid, salary, dept);
		this.teamsize = teamsize;
		this.skills = skills;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Manager [teamsize=" + teamsize + ", skills=" + skills + ", toString()=" + super.toString() + "]";
	}
	
	
}
