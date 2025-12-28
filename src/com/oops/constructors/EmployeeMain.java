package com.oops.constructors;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("firstName: ");
		String firstname=sc.nextLine();
		System.out.print("lastName: ");
		String lastname=sc.nextLine();
		
		System.out.print("employeeId: ");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.print("salary: ");
		double salary=Double.parseDouble(sc.nextLine());
		
		System.out.print("NoOfProject: ");
		int noOfProject=Integer.parseInt(sc.nextLine());
		
		Employee nitish=new Employee(firstname, lastname, id, salary, noOfProject);
		nitish.calculateSalary();
        System.out.println(nitish);
        sc.close();
	}

}
