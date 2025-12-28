package com.nitish.elc;

import com.nitish.blc.Employee;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee nitish=new Employee();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter employee id ");
		int employeeid=Integer.parseInt(sc.nextLine());
		System.out.print("Enter employee name: ");
		String employeename=sc.nextLine();
		System.out.print("Enter employee salary ");
		double employeesalary=Double.parseDouble(sc.nextLine());
		
		nitish.setEmployeeData(employeeid, employeename, employeesalary);
		nitish.getEmployeeData();
		
		

	}

}
