package com.oops.passByValue;

public class Sourcing {
	private Employee employee;
	private int enrollmentTarget;
	private double enrollmentReached;
	private double perkPerEnrollment;
	
	public Sourcing(Employee employee,
			int enrollmentTarget, double enrollmentReached, double perkPerEnrollment) {
		super();
		this.employee=employee;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double calculateGrossSalary() {
		
		 return employee.calculateGrossSalary()+(((this.enrollmentReached/this.enrollmentTarget)*100)*perkPerEnrollment);
		}
	
	 public Employee getEmployee() {
		 return employee;
	 }
	
	

}
