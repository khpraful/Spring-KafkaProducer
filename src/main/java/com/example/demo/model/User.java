package com.example.demo.model;

public class User {
	
	private String name;
	private String dept;
	private long sal;
	public User(String name, String dept, long sal) {
		super();
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	
	

}
