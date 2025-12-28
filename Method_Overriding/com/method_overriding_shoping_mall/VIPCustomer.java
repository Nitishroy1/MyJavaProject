package com.method_overriding_shoping_mall;

public class VIPCustomer extends Customer{
	
	protected double discountRate = 15.0;

	public VIPCustomer(String name) {
		super(name);
	} 
	
	public double calculateBill(double ...prices) {
		double total= super.calculateBill(prices);
		return total;
		
	}
	@Override
	public void printDetails() {
		double discount= super.total*discountRate/100;
		double final_bill= super.total-discount;
		IO.println("---------------------------------------------------------");
		IO.println("Customer name: "+super.name);
		IO.println("Total Amount: "+super.total);
		IO.println("Discount Amount: "+discount);
		IO.println("Final Amount: "+final_bill);
	}
	
}


