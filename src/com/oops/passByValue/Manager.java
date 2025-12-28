package com.oops.passByValue;

public class Manager {
	private Employee employee;
	private double ProjectAllowance;
	
	
	
	
	public Manager( Employee employee, double projectAllowance) {
		super();
		this.employee=employee;
		ProjectAllowance = projectAllowance;
	}

    


	public Employee getEmployee() {
		return employee;
	}




	public void setEmployee(Employee employee) {
		this.employee = employee;
	}




	public double getProjectAllowance() {
		return ProjectAllowance;
	}




	public void setProjectAllowance(double projectAllowance) {
		ProjectAllowance = projectAllowance;
	}




	public double calculateGrossSalary() {
		
	 return employee.calculateGrossSalary()+ this.ProjectAllowance;
	}
	
	
}
