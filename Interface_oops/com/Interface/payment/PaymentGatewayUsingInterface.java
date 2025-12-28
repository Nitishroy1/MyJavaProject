package com.Interface.payment;

public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		IO.print("Enter Payment Type [CreditCard / UPI]:");
		String paymentType=IO.readln();
		
		PaymentGateway paymentgetway= new PaymentGateway();
		Payment payment=null;
		payment=paymentgetway.initiatePayment(paymentType);
		payment.processPayment();
		payment.applyDiscount();
		
		

	}

}
