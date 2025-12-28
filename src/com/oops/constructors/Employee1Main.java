package com.oops.constructors;
import java.util.*;

public class Employee1Main {
	public static void main(String[] args) {
		int count=1;
		while(true) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Details For Employee "+count);
			System.out.print("Enter Employee Name: ");
			String name= sc.nextLine();
			System.out.print("Enter Employee ID: ");
			int id= Integer.parseInt(sc.nextLine());
			System.out.print("Enter Monthly Salary: ");
			double salary= Double.parseDouble(sc.nextLine());
			System.out.print("Enter Department (Sales, Engineering, HR, Other):");
			String department= sc.nextLine();
			
			Employee1 emp1= Employee1.createEmployeeObject(name, id, department, salary);
			System.out.println(emp1);
			
			System.out.print("Enter Your choice yes\no: ");
			String choice=sc.nextLine();
			
			if(choice.equalsIgnoreCase("no")) {
				break;
			}
		    count++;
			
			}
		
	}

}
