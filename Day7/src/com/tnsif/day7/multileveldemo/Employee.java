package com.tnsif.day7.multileveldemo;
//Child class
public class Employee extends Person {
	private int empid;
	private float salary;
	private String dept;
	public Employee() {
		super();
	}
	public Employee(String name, int age, String add, int empid, float salary, String dept) {
		super(name, age, add);
		this.empid = empid;
		this.salary = salary;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
