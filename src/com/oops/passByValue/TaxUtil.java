package com.oops.passByValue;

public class TaxUtil {
	
	public static double calculateTax(Employee e) {
		double gross_salary= e.calculateGrossSalary();
		return gross_salary>50000?gross_salary-(gross_salary*0.2):gross_salary-(gross_salary*0.05);
	}
	public static double calculateTax(Manager m1) {
		double gross_salary= m1.calculateGrossSalary();
		return gross_salary>50000?gross_salary-(gross_salary*0.2):gross_salary-(gross_salary*0.05);
	}
	public static double calculateTax(Trainer t) {
		double gross_salary= t.calculateGrossSalary();
		return gross_salary>50000?gross_salary-(gross_salary*0.2):gross_salary-(gross_salary*0.05);
	}
	public static double calculateTax(Sourcing s) {
		double gross_salary= s.calculateGrossSalary();
		return gross_salary>50000?gross_salary-(gross_salary*0.2):gross_salary-(gross_salary*0.05);
	}

}
