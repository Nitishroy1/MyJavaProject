package com.opp.constructor.passByValue;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Nitish");
		System.out.println(e1);
		Manager m1=new Manager(e1);
		System.out.println(m1);
		
		Boss b1= new Boss(e1);
		System.out.println(b1);
		e1.setEmployeeId(102);
		e1.setEmployeeName("Raj");
		System.out.println(e1);
		System.out.println(m1);
		System.out.println(b1);
		
	}

}
