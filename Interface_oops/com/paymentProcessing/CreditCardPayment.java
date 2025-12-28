package com.paymentProcessing;

non-sealed class CreditCardPayment implements Payment{
	private String cardHolderName;
	public CreditCardPayment(String cardHolderName) {
		this.cardHolderName=cardHolderName;
	}

	@Override
	public void makePayment(double amount) {
		IO.println("Paid RS : "+amount+" using Credit Card Holder : "+this.cardHolderName);
	}

	@Override
	public void makeRefund(double amount) {
		
		
		IO.println("Cancelling order for amount RS : "+amount);
		IO.println("Refunded RS : "+amount+" to Credit Card Holder : MR."+this.cardHolderName);
		
	}
	

}
