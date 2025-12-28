package com.oops.constructors;

public class Employee {
	
	private String firstName;
	private String lastName;
	private  int  employeeId;
	private double salary;
	private int noOfProject;
	
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		
		if(noOfProject<5) {
			System.err.println("Number of projects cannot be negative");
			System.exit(0);
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	
	public void calculateSalary() {
		if(noOfProject>5 && noOfProject<10) {
			salary=salary+5000;
		}
		else if(noOfProject>10 && noOfProject<20) {
			salary=salary+10000;
		}
		else if(noOfProject>20 ) {
			salary=salary+15000;
		}
		
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}
	
	
	
	
	

}
