package com.Method_Overloading;

public class Payment {
	//helper method 2
	private boolean validateAmount(double amount) {
		if(amount<=0) {
		System.err.println("amount must be greater than 0");
		
		return false;
		
		}
		else {
			return true;
		}
		
	}
	
	//helper method 2
	private boolean validateCardNumber(String cardNumber ) {
		if(cardNumber.length()==16) {
			return true;
		}
		else {
			return false;
		}
		
	}
	//helper method 3
	private String maskCardNumber(String cardNumber) {
		if(cardNumber==null||cardNumber.isEmpty()) {
			return "";
		}
		
		int length= cardNumber.length();
		if(length<=4) {
			return cardNumber;
		}
		int maskLength= length-4;
		String mask="*".repeat(maskLength);
		String lastFour= cardNumber.substring(maskLength);
		return mask+lastFour;
		
	}
	//method 1
	public void makePayment(double amount) {
	 	if(validateAmount(amount)) {
		 	// process cash or other non-card payment
			System.out.println("Processing payment of Rs."+amount);
		}
		else {
			System.exit(0);
		}
		
		
	}
	//method 2
	
	public void makePayment(String cardHolderName, String creditCardNumber,double amount) {
		if(validateCardNumber(creditCardNumber) && validateAmount(amount)) {
		 	String masked = maskCardNumber(creditCardNumber);
			System.out.println("Processing credit card payment of Rs."+amount+" for "+cardHolderName+" using card "+masked);
		}
		else {
			// invalid input
		}
	}
	//method 3
	
	public void makePayment(String debitCardNumber, double amount) {
		// validate inputs first
		if(!validateCardNumber(debitCardNumber) || !validateAmount(amount)) {
			
			return;
		}
		
		String masked = maskCardNumber(debitCardNumber);
		System.out.println("Processing debit card payment of Rs."+amount+" using card "+masked);
	
	}

}
