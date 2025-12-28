package com.method_overriding_shoping_mall;

public class GeneralCustomer extends Customer {

	public GeneralCustomer(String name) {
		super(name);
	}
	@Override
	public double calculateBill(double ...prices) {
		double total= super.calculateBill(prices);
		return total;
		
	}
	
	

}
