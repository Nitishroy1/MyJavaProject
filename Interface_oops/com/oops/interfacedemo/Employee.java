package com.oops.interfacedemo;

public class Employee {
	public static void main(String[] args) {
		Payable employee= new Payable() {
			
			@Override
			public void pay(double amount) {
				IO.println("payable amount is: "+amount);
				
			}
		};
		employee.pay(1200);
		Payable contractor= new Payable() {
			
			@Override
			public void pay(double amount) {
				IO.println("Payable amount is : "+amount);
				
			}
		}; 
		contractor.pay(14000);
	}
}
