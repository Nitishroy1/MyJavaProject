package com.method_overriding.oop;


class Employee{
	protected int id;
	protected String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public double calculateSalary() {
		return 0.0;
	}
}
class FullTimeEmployee extends Employee{
	protected double salary;
	public FullTimeEmployee(int id,String name, double salary) {
		super(id, name);
		if(salary<=0) {
			System.out.println("Salary can't be negative!! ");
			System.exit(0);
		}
		this.salary=salary;
	}
	@Override
	public double calculateSalary() {
		return salary;
	}
	
}
class PartTimeEmployee extends Employee{
	protected double hourlyRate;
	protected int hoursWorked;
	
	public PartTimeEmployee(int id ,String name, double hourlyRate,int hoursWorked) {
		super(id, name);
		if(hourlyRate<=0) {
			System.out.println("Employee hourly rate can't be zero OR Negative");
			System.exit(0);
		}
		if(hoursWorked<0) {
			System.out.println("Employee hours of work can't be Negative");
			System.exit(0);
		}
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public double calculateSalary() {
		return hourlyRate*hoursWorked;
	}
}

public class Employee_main {
	public static void main(String[] args) {
		System.out.println("\t\t***Salary Calculation Menu***");
		IO.println("\t\t1) FullTime Employees");
		IO.println("\t\t2) PartTime Employee");
		IO.print("Please select the Employee Type: ");
		int choice=Integer.parseInt(IO.readln());
		switch(choice) {
		
		
		case 1 ->
		{
		IO.print("Enter Fulltime Employee Id : ");
		int id=Integer.parseInt(IO.readln());
		IO.print("Enter Fulltime Employee Name: ");
		String name=IO.readln();
		IO.print("Enter the salary: ");
		double salary=Double.parseDouble(IO.readln());
		
		Employee employee=new FullTimeEmployee(id, name, salary);
		IO.println(name+" Salary is: "+employee.calculateSalary());
			
		}
		case 2 ->
		{
			IO.print("Enter PartTime Employee Id : ");
			int id=Integer.parseInt(IO.readln());
			IO.print("Enter PartTime Employee Name: ");
			String name=IO.readln();
			IO.print("Enter Your hourly rate: ");
			double houralyRate=Double.parseDouble(IO.readln());
			IO.print("Enter your total works hour in the month: ");
			int totleWorkhr=Integer.parseInt(IO.readln());
			
			Employee employee=new PartTimeEmployee(id, name, houralyRate, totleWorkhr);
			IO.println(name+" Salary is: "+employee.calculateSalary());
			
		}
		}
	}
	

}
