package com.Method_Overloading;

import java.util.*;

public class PaymentProcces {

	public static void main(String[] args) {
		
    Scanner sc= new Scanner(System.in);
    System.out.println("Payment Menu");
    System.out.println("please select any one Payment Method from the Menu:");
    System.out.println("\t\t 1) Payment by using Cash ");
    System.out.println("\t\t 2) Payment by using Credit Card ");
    System.out.println("\t\t 3) Payment by using Debit Card ");
    System.out.print("\t\t select any one method: ");
    int choice= Integer.parseInt(sc.nextLine());
    System.out.print("Enter your amount: ");
    double amount= Double.parseDouble(sc.nextLine());
    Payment p=new Payment();
    switch(choice) 
    {
    case 1 ->
    {
    	System.out.println("Processing payment via Cash");
    	p.makePayment(amount);
    	System.out.println("payment Successful! ");
    	
    }
    case 2 ->
    {
        System.out.println("Processing payment via Credit Card...");
        System.out.print("Enter card Number: ");
    	String cardNumber= sc.nextLine();
    	System.out.print("Enter card Holder Name: ");
        String cardHolderName= sc.nextLine();
        p.makePayment(cardHolderName, cardNumber, amount);
        System.out.println("payment Successful! ");
    }
    case 3 ->
    {
    	System.out.println("Processing payment via debitCard Card...");
    	System.out.print("Enter Debit Card Number: ");
    	String debitCardNumber= sc.nextLine();
    	p.makePayment(debitCardNumber, amount);
    	System.out.println("payment Successful! ");
    }
    
    }
    sc.close();
    
	}
	

}
