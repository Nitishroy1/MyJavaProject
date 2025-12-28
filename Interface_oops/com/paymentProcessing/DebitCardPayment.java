package com.paymentProcessing;

non-sealed class DebitCardPayment implements Payment {
	private String bankName;

	public DebitCardPayment(String bankName) {
		super();
		this.bankName = bankName;
	}

	@Override
	public void makePayment(double amount) {
		
		IO.println("Paid RS : "+amount+" using Debit Card Bank : "+this.bankName);
	}

	@Override
	public void makeRefund(double amount) {
		
		IO.println("Cancelling order for amount RS : "+amount);
		IO.println("Refunded RS : "+amount+" to Debit Card Bank : MR."+this.bankName);
	}
	
	
}
