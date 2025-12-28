package com.opp.constructor.passByValue;

public class PassByValueMain {
	public static void main(String[] args) {
		PassByValue p1= new PassByValue("Nitish", 5.6);
		System.out.println(p1);
		accept(p1);
		System.out.println(p1.getName());
		System.out.println(p1);
		changeall(p1);
		System.out.println(p1);
		
		
	}
	public  static void accept(PassByValue emp) {
		emp.setName("Pk");
		
	}
	public static void changeall(PassByValue changall) {
		changall.setName("Raj");
		changall.setHeight(5.8);
		changall=new PassByValue("scort", 6.8);
		changall.setHeight(8.7);
	}
	
	

}
