package com.Interface.payment;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment() {
		IO.println("Processing Credit Card payment...");
	}

	@Override
	public void applyDiscount() {
		IO.println("Applying 10% discount for Credit Card payment");
	}
	

}
