package com.pramit.model;

public class Student {
	private String name;
	private String surname;
	private String rollNo;
	private Integer totalMarks;
	
	public Student(String rollNo, String name, String surname) {
		this.rollNo = rollNo;
		this.name = name;
		this.surname = surname;
	}
	
	public Integer getMarks() {
		return totalMarks;
	}
	
	@Override
	public String toString() {
		return surname + ", " + name + "(" + rollNo + ")";
	}
}
