package com.nk.array;
class Employee1{
	int id;
	String name;
	double salary;
	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 ID=" + id + 
				",\nEmployee Name: " + name + 
				",\nEmployee Salary: " + salary+
				"\n------------------------------";
	}
	
	
}

public class Employee {
	public static void main(String[] args) {
		Employee1 employee[]= new Employee1[4];
		employee[0]=new Employee1(101,"John",45000);
		employee[1]=new Employee1(102,"Amit",40000);
		employee[2]=new Employee1(103,"Ram",50000);
		employee[3]=new Employee1(104,"Shyam",60000);
		
		System.out.println("Employee Details:\r\n"
				);
		for(int i=0;i<employee.length;i++) {
			System.out.println(employee[i]);
		}
	}
	

}
