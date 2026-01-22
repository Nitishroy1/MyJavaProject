package com.arrayListdemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeManagement {
	ArrayList<Employee> employee;

	public EmployeeManagement(ArrayList<Employee> employee) {
		super();
		this.employee = employee;
	}
	// Add Employee
	public void addEmployee() {
		int numOfEmp=Integer.parseInt(IO.readln("Enter how many number of Employee you want to Add: "));
		for(int i=1;i<=numOfEmp;i++) {
	    IO.println("-------------"+i+") Enter Employee detaile--------------");
		String eName=IO.readln("Enter Employee Name: ");
		String ePosition=IO.readln("Enter Employee position: ");
		double salary=Double.parseDouble(IO.readln("Enter Employee Salary: "));
		Employee emp=new Employee(eName, ePosition, salary);
		employee.add(emp);
		}
		IO.println("Employee  Added succesfully");
	}
	//displaye
	public void displayAllEmployees() {
		employee.forEach(System.out::println);
	}
	
	//updateEmployee()
	/*public void updateEmployee() {
		IO.println("Update Employee Data: ");
		String eName=IO.readln("Enter Employee Name: ");
		String ePosition=IO.readln("Enter Employee position: ");
		double salary=Double.parseDouble(IO.readln("Enter Employee Salary: "));
		ListIterator<Employee> lt=employee.listIterator();
		while(lt.hasNext()) {
			Employee e=lt.next();
			if(e.empName().equals(eName)) {
				
			}
			
		}
		IO.println("Employee with "+ename+" will be deleted");
	}
	*/
	//deleteEmployee()
	public void deleteEmployee() {
		String ename=IO.readln("Enter employee Name: ");
		ListIterator<Employee> lt=employee.listIterator();
		while(lt.hasNext()) {
			Employee e=lt.next();
			if(e.empName().equals(ename)) {
				lt.remove();
			}
			
		}
		IO.println("Employee with "+ename+" will be deleted");
	}
	

}
