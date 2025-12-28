package com.nitish.oop;

public class EmployeeIT {
	private int  id;
	private String name;
	private double salary;
	
	
	public void setEmployeeDetails(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	public void calculateSalaryIncrement() {
		double incAmount=0;
		
		if(this.salary<50000) {
			
			incAmount =(salary*0.1);
			this.salary=salary+incAmount;
			
			
			
		}
		else if(this.salary<80000) {
			incAmount =(salary*0.07);
			this.salary=salary+incAmount;
			
			
		}
		else {
			incAmount =(salary*0.05);
			this.salary=salary+incAmount;
			
		}
		
		System.out.println("Salary Increment Amount: "+incAmount);
		System.out.println("Updated Salary: "+this.salary);
		
		
	}

	@Override
	public String toString() {
		return "EmployeeIT [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
