package com.Method_Overloading;

	class Payment1{
		public double makePayment(double amount) {
			return 0.0;
		}
	}
	class Case extends Payment1{
		public double makePayment(double amount) {
			return amount;
			
		}
	}
	class Cidetcard extends Payment1{
		public double makePayment(double amount) {
			return amount;
		}
		public void Offer() {
			IO.println("You have extra 20% off offer in this card.. ");
		}
	}
	class UPI extends Payment1{
		public double makePayment(double amount) {
			return amount;
		}
		public void Offer() {
			IO.println("You have extra 10% off offer in this .. ");
		}
	}
	class DebitCard extends Payment1{
		public double makePayment(double amount) {
			return amount;
		}
	}
	
public class PaymentSystem {
	
	public static void main(String[] args) {
		
		Payment1 p = null;
		p = new Case();
		executePayment(p);
		p=new Cidetcard();
		executePayment(p);
		p=new DebitCard();
		executePayment(p);
		p=new UPI();
		executePayment(p);
	}
	
	public static void executePayment(Payment1 payment) {
		if(payment instanceof Case c ) {
			double amount=c.makePayment(2000);
			IO.println("Payment make by case amount is: "+amount);
			
		}
		else if(payment instanceof Cidetcard cridCArd) {
			double amount=cridCArd.makePayment(3000);
			IO.println("Making a payment "+amount+ "using cridetcard" );
			cridCArd.Offer();
		}
		
		else if(payment instanceof DebitCard d) 
		{
			double amount=d.makePayment(3000);
			IO.println("Making a payment "+amount+ "using DebitCard" );
			
		}
		else if(payment instanceof UPI upi) {
			double amount=upi.makePayment(3000);
			IO.println("Making a payment "+amount+ "using upi" );
			upi.Offer();
		}
	}

}
