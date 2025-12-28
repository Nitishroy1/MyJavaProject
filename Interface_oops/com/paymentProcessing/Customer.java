package com.paymentProcessing;

public class Customer {

	public static void main(String[] args) {
		IO.print("Enter your total bill Amount :");
		double totalAmount=Double.parseDouble(IO.readln());
		IO.println("Choose Payment Method:");
		IO.println("1. Credit Card");
		IO.println("2. Debit Card");
		IO.println("3. UPI");
		IO.print("Enter your choice: ");
		int choice=Integer.parseInt(IO.readln());
		ShoppingCart shoppingCart=new ShoppingCart(totalAmount);
		Payment payment=null;
		switch(choice)
		{
		case 1->{
			String CardHolderName=IO.readln("Enter Card Holder Name:");
		    payment=new CreditCardPayment(CardHolderName);
		    shoppingCart.checkout(payment);
		    shoppingCart.cancelOrder(payment);
		   
		}
		case 2->{
			String DebitCardBankName=IO.readln("Enter Debit card Bank Name:");
			payment=new DebitCardPayment(DebitCardBankName);
			shoppingCart.checkout(payment);
			shoppingCart.cancelOrder(payment);
			
		}
		case 3->{
			String upiID=IO.readln("Enter UPI ID :");
			payment=new UPIPayment(upiID);
			shoppingCart.checkout(payment);
			shoppingCart.cancelOrder(payment);
			
		}
		}
		

	}

}
