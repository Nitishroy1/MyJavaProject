package com.oops.constructors;

public class EmployeeIt {
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	public EmployeeIt(int employeeNumber,String employeeName, double employeeSalary) {
		this.employeeNumber=employeeNumber;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		if(employeeSalary<this.employeeSalary) {
			System.err.println("Invalide Amount:");
		}
		this.employeeSalary = employeeSalary;
	}
	
	public String getEmployeeDesignation(double salary) {
		if(salary==120000) {
			return " Employee is a HR Manager.";
		}
		else if(salary==90000) {
			return " Employee is a Developer.";
		}
		
		else if(salary==60000) {
			return " Employee is a Designer.";
		}
		else {
			return "Invalid ";
		}
		 
		
	}

	@Override
	public String toString() {
		return "EmployeeIt [employeeNumber=" + employeeNumber
				+ ", employeeName=" + employeeName + 
				", employeeSalary="+ employeeSalary + "]";
	}
	
	
	
	
	

}
