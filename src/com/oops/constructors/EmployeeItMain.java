package com.oops.constructors;
import java.util.*;

public class EmployeeItMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Employee Number : ");
		int number=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Name: ");
		String name= sc.nextLine();
		System.out.print("Enter Employee Salary: ");
		double salary= Double.parseDouble(sc.nextLine());
		System.out.println("-----Employee Details :-------");
		
		EmployeeIt ram= new EmployeeIt(number, name, salary);
		System.out.println(ram);
		
		System.out.print("Enter Increment Amount: ");
		double IncrementSalary= Double.parseDouble(sc.nextLine());
		
//		ram.setEmployeeSalary( ram.getEmployeeSalary()+ IncrementSalary);
		ram.setEmployeeSalary( salary + IncrementSalary);
		System.out.println("Updated Employee Details :");
		System.out.println(ram);
		System.out.println(name+ram.getEmployeeDesignation(ram.getEmployeeSalary()));
		
		
		sc.close();

	}

}
