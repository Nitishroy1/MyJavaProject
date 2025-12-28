package com.nitish.blc;

public class Employee {
  int employeeId;
  String employeeName;
  double employeeSalary;
  
  public void setEmployeeData(int id, String name, double salary) {
	employeeId=id;
	employeeName=name;
	employeeSalary=salary;
}
  public void getEmployeeData() {
	System.out.println(" employee Id is : "+employeeId);
	System.out.println(" employee name is : "+employeeName);
	System.out.println(" employee salary is : "+ employeeSalary);
}
}
