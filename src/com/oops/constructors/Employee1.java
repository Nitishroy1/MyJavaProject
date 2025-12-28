package com.oops.constructors;

public class Employee1 {
	
	private String name;
	private int  id;
	private String department;
	private double salary;
	public Employee1(String name, int id, String department, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary +"NewAnualSalary="+calculateAnnualSalary()+ "]";
	}
	
	public static Employee1 createEmployeeObject(String name, int id, String department,double salary ) {
		return new Employee1(name, id, department, salary);
	}
	
	public double calculateAnnualSalary() {
		switch (department) {
		case "Sales" ->
		
		{
		return this.salary= this.salary+(this.salary*0.1);	
		
		}
		case "Engineering" ->{
			return this.salary=this.salary+(this.salary*0.15);
		}
		
		case "HR" ->{
			return this.salary= this.salary+(this.salary*0.08);
		}
		default -> {
			return salary= this.salary+(this.salary*0.05);
		}
			
		}
		
	}

}
