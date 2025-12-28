package com.nitish.oop;
import java.util.*;

public class EmployeeITMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeIT nitish =new EmployeeIT();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
		
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Employee Name : ");
		String name= sc.nextLine();
		
		System.out.print("Enter Employee Salary: ");
		double salary=Double.parseDouble(sc.nextLine());
		
		
		System.out.println("----------Employee Information-----------");
		System.out.println("Employee Details: ");
		nitish.setEmployeeDetails(id, name, salary);
		System.out.println(nitish);
		
		
		System.out.println("-----------SalaryIncrement Details------------");
		nitish.calculateSalaryIncrement();
	}

}
