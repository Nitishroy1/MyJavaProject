package com.oops.passByValue;

public class Trainer {
	private Employee employee;
	private int batchCount;
	private double perkPerBatch;
	
	public Trainer(Employee employee, int batchCount,
			double perkPerBatch) {
		super();
		this.employee=employee;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary() {
		
		return employee.calculateGrossSalary()+(this.batchCount+this.perkPerBatch);
		}
	
	public Employee getEmployee() {
		return employee;
	}
	
	
	

}
