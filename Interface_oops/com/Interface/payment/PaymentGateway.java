package com.Interface.payment;

public class PaymentGateway {
	
	public Payment initiatePayment(String paymentType) {
		
		if(paymentType.equalsIgnoreCase("creditcard")) {
			IO.println("Initiating Credit Card payment");
			return new CreditCardPayment();
		}
		else if(paymentType.equalsIgnoreCase("UPI")) {
			IO.println("Initiating UPI payment");
			return new UPIPayment();
		}
		else {
			IO.println("Invalid payment type selected!");
			System.exit(0);
			return null;
		}
		
	}

}
