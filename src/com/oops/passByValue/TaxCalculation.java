package com.oops.passByValue;
import java.util.*;

public class TaxCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name= sc.nextLine();
		
		System.out.print("Enter Employee Id: ");
		int id= Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Employee Basic Salary: ");
		double basicSalary=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Employee HARPer: ");
		double HARPer=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Employee DAPer: ");
		double DAPer=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Employee enrollmentReached: ");
		int enrollmentReached= Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Employee Parkenrollment: ");
		int Parkenrollment= Integer.parseInt(sc.nextLine());
		 
		System.out.print("Enter Employee enrollmentTarget: ");
		int enrollmentTarget= Integer.parseInt(sc.nextLine());
		
		
		Employee emp= new Employee(id, name, basicSalary, DAPer, DAPer);
		Manager m1= new Manager(emp, Parkenrollment);
		Trainer t=new Trainer(emp, Parkenrollment, DAPer);
		Sourcing s1=new Sourcing(emp,enrollmentTarget,enrollmentReached, Parkenrollment);
		
		System.out.println("Employee: "+ emp + ", Gross Salary: "+ emp.calculateGrossSalary()+ ", Tax: "+TaxUtil.calculateTax(emp));

		System.out.println("Manager: "+ m1 + ", Gross Salary: "+ m1.calculateGrossSalary()+ ", Tax: "+TaxUtil.calculateTax(m1));

		System.out.println("Trainer: "+ t + ", Gross Salary: "+ t.calculateGrossSalary()+ ", Tax: "+TaxUtil.calculateTax(t));

		System.out.println("Employee: "+ s1 + ", Gross Salary: "+ s1.calculateGrossSalary()+ ", Tax: "+TaxUtil.calculateTax(s1));
		
		
		
		

	}

}
