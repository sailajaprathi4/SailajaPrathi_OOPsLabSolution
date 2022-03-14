package com.oops.labsolution1;

public class Employee {
	 
	private String firstName;
	private String LastName;
	private String department;
	public Employee(String firstName,String LastName,String department)
	{
		this.firstName=firstName;
		this.LastName=LastName;
		this.department=department;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	}
