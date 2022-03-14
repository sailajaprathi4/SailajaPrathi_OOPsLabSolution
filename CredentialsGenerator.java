package com.oops.labsolution.emailapp.service;

import java.util.Random;

import com.oops.labsolution1.Employee;

public class CredentialsGenerator {
	private Employee employee;
	private String generateEmailId;
	private char[] generatePassword =new char[8];
	public CredentialsGenerator(Employee employee)
	{
		this.employee=employee;
	}
	public void generateEmailId() {
		String shortDepartment=getshortDepartment();
		
		String emailId=employee.getFirstName().toLowerCase() + "." + employee.getLastName().toLowerCase() + "@" +shortDepartment + ".gl.com";
		this.generateEmailId = emailId;
	}
private String getshortDepartment() 
{
	String departmentName = employee.getDepartment();
	
	if (departmentName.equals("Technical"))
	{
		return "tech";
}
	else if (departmentName.equals("Admin"))
	{
		return "adm";
		}
	else if (departmentName.equals("Human Resource"))
	{
		return "hr";
		}
	else if (departmentName.equals("Legal"))
	{
		return "lgl";
		}
	
	return "  ";
		
}
public void generatePassword() 
{
	String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String specialCharacters="~!@#$%^&*()_+=-/.?><";
	
	String addingValues=capitalLetters + smallLetters + numbers + specialCharacters;
	
	Random randomObj = new Random();
	 for(int i=0;i<8;i++)
	 {
		 int boundValue = addingValues.length();
		 int randomIndex=randomObj.nextInt(boundValue);
		 char randomChar=addingValues.charAt(randomIndex);
		 this.generatePassword[i]=randomChar;
	 }
}
public void showCredentials() {
	System.out.println("Dear" + employee.getFirstName() + ",");
	System.out.println("your generated credentials are as follows");
	System.out.println("Email Id : " +generateEmailId );
	System.out.println("password : " +generatePassword);
	
}

}
