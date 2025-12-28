package com.nk.array;

public class EmployeeTcs {
	private int id;
	private String name;
	private double salary;
	
	public EmployeeTcs(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public  int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "EmployeeTcs [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}
