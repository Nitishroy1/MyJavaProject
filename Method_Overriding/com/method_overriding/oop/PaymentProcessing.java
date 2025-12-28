package com.method_overriding.oop;

class Payment{
	public void processPayment() {
		IO.println("Processing payment");
		
	}
}
class CreditCardPayment extends Payment{
	@Override
	public void processPayment() {
		IO.println("Processing credit card payment");
	}
	
}
class DebitCardPayment extends Payment{
	@Override
	public void processPayment() {
		IO.println("Processing Debit Card payment");
		
	}
}
class UPIPayment extends Payment{
	@Override
	public void processPayment() {
		IO.println("Processing UPI payment");
	}
}
public class PaymentProcessing {

	public static void main(String[] args) {
		CreditCardPayment credit= new CreditCardPayment();
		DebitCardPayment debit = new DebitCardPayment();
		UPIPayment upi = new UPIPayment();
		paymentGateway(credit,debit,upi);
		

	}  
	public static void paymentGateway(Payment ... payment) {
		for(Payment pay: payment) {
			pay.processPayment();
		}
		
	}

}
