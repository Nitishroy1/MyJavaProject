package com.paymentProcessing;

public class ShoppingCart {
	private double totalAmount;

	public ShoppingCart(double totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}
	
	//m1
	public void checkout(Payment payment) {
		IO.println("Starting checkout for amount RS :"+this.totalAmount);
		payment.makePayment(totalAmount);
		
		
	}
	//m2
	public void cancelOrder(Payment payment) {
		IO.println("\n\n");
		IO.println("Order Canceled. Initiating Refund.....");
		
		payment.makeRefund(totalAmount);
		
	}

}
