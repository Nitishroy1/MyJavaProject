package com.nitish.oop;

public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	public void setEmployeeData(String firstname,String lastname, int employeeid,double empsalary, int noofProject) {
		firstName=firstname;
		lastName=lastname;
		employeeId=employeeid;
		salary=empsalary;
		noOfProject=noofProject;
		
	}
	public void calculateSalary() {
		if(noOfProject>=5) {
		if(noOfProject>=5 && noOfProject<10) {
			salary=salary+5000;
		}
		else if(noOfProject>10 && noOfProject<20) {
			salary=salary+10000;
		}
		else if(noOfProject<=20) {
			salary=salary+15000;
		}
		}
		else {
			System.out.println("No of project they alocate in this employee is lass then 5 so no any aditional amount add in the original salary");
		}
		
		
	}
	
	public void displayDetails() {
		System.out.println("Employe Full Name is: " + firstName +" "+lastName);
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee salary: "+salary);
		System.out.println("No of Project those Employee alocated is: "+noOfProject);
		
	}

}
