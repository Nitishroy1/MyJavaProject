package com.nitish.oop;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee nitish=new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Employee First Name: ");
		
		String firstName=sc.nextLine();
		System.out.print("Enter Employee Last Name: ");
		
		String lastName= sc.nextLine();
		System.out.print("Enter Employee Salary: ");
		
		double EmployeeSalary=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Employee id:");
        int employeeId=Integer.parseInt(sc.nextLine());
         
         System.out.print("Enter no of project Alocate of Employee(project is more then 5): ");
         int noOfproject=Integer.parseInt(sc.nextLine());
         
         if (noOfproject < 5) {
             System.out.println("You should enter a valid project no");
             sc.close();
             return;
         }
     
     System.out.println("----------- Employee Info ---------------------------------------------------");    
         nitish.setEmployeeData(firstName, lastName,employeeId,EmployeeSalary, noOfproject);
         nitish.calculateSalary();
         nitish.displayDetails();
         sc.close();
		
	}

}