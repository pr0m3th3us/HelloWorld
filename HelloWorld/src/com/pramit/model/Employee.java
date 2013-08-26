package com.pramit.model;

public class Employee {
	private String name;
	private String surname;
	private String employeeID;
	
	public Employee(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return surname + ", " + name;
	}
}
