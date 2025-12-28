package com.paymentProcessing;

non-sealed class UPIPayment implements Payment {
	private String upiId;

	public UPIPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount) {
		
		IO.println("Paid RS : "+amount+" using UPI ID : "+this.upiId);
		
	}

	@Override
	public void makeRefund(double amount) {
		
		IO.println("Cancelling order for amount RS : "+amount);
		IO.println("Refunded RS : "+amount+" to UPI ID: "+this.upiId);
	}
	

}
