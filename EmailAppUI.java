package com.oops.labsolution.emailapp.ui;
import com.oops.labsolution.emailapp.service.CredentialsGenerator;
import com.oops.labsolution1.Employee;
import java.util.Scanner;
public class EmailAppUI {

	public void init()
	{
		Employee employee=buildUI();
		callService(employee);
	}
	private Employee buildUI()
	{
		buildWelcomeSection();
		Employee employee=buildEmployeeDetailsSection();
		return employee;
	}
	private void buildWelcomeSection()
	{
		System.out.println("------------------------------------");
		System.out.println("welcome to Email Application Service");
		System.out.println("-------------------------------------");
	}
	private String getDepartmentName(int departmentID) 
	{
		if(departmentID==1)
		{
			return "Technical";
		}
		else if (departmentID==2)
		{
			return "Admin";
		}
		else if (departmentID==3)
		{
			return "Human Resource";
		}
		else if (departmentID==4)
		{
			return "Legal";
		}
		else {
			return "";
		}
		
	}
private Employee buildEmployeeDetailsSection() {
	Scanner userInput=new Scanner(System.in);
	System.out.println("Enter employee's first name");
	String firstName=userInput.nextLine();
	
	System.out.println("Enter employee's last name");
	String lastName=userInput.nextLine();
	
	System.out.println("Please Enter the department from the following:");
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Human Resource");
	System.out.println("4.Legal");
	System.out.println("enter the numbers between 1 to 4");
	int departmentID = userInput.nextInt();
	String departmentName=getDepartmentName(departmentID);
	Employee employee =new Employee(firstName,lastName,departmentName);
	userInput.close();
	return employee;
}
public void callService(Employee employee) 
{
CredentialsGenerator generator=new CredentialsGenerator(employee);
generator.generateEmailId();
generator.generatePassword();
generator.showCredentials();
}

}

