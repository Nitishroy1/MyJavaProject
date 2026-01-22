package com.arrayListdemo;

import java.util.ArrayList;

public class EmployeeDirectoryExample {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		EmployeeManagement emp= new EmployeeManagement(list);
		emp.addEmployee();
	}

}
