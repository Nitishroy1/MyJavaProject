package com.method_overriding_shoping_mall;

public class Customer {
	protected String name;
	protected double total;
	
	public Customer(String name) {
		super();
		if(name==null|| name.isBlank()) {
			IO.println("name must not be null");
			System.exit(0);
		}
		this.name = name;
	}
	
	public double calculateBill(double ...prices) {
		for(double price : prices) {
			if(price<0) {
				IO.println("price must not be negative.");
				System.exit(0);
			}
			total=total+price;
			
		}
		return total;
	}
	
	//m2
	public void printDetails() {
		IO.println("---------------------------------------------------------");
		IO.println("Customer name: "+this.name);
		IO.println("Total Cost: "+this.total);
		IO.println("No discount for general customer.");
	}
	

}
