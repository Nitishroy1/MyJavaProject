package com.nitish.oop;

public class Bank {
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	static String bankName="ICICI BANK";
	static String bankAddress="Simri Darbhanga 847106";
	static String bankIFSCCode="ICICI847106";
	
	public void setCustomerDeatils(String name, int accountNum,double balance) {
		
		if(balance<=0) {
			System.err.println("You are trye to Enter a not valide amount PlZ Enter a valid amount ");
			System.exit(0);
		}
		
		customerName=name;
		accountNumber=accountNum;
		currentBalance=balance;
		
		
	}
	
	public void withdraw(double amount) {
		
		if(currentBalance<amount) {
			System.err.println("You have insufficient balance ");
			System.exit(0);
		}
		currentBalance=currentBalance-amount;
		
		System.out.println("Withdrawl succesful! $" +amount+" debited");
		
	}
	
	public void deposit(double amount) {
		if(amount<=0) {
			System.err.println("you trye to deposit Invalid amount Plz Enter a valid amount:");
			System.exit(0);
		}
		currentBalance=currentBalance+amount;
		System.out.println("Deposit successfull! : "+amount+" credited.");
		
	}
	
	//method 4
	public double getCurrentBalance() {
		return currentBalance;
			
	}
	
	//method 5
	public String displayDetails() {
		return "Customer [ Name= "+customerName+", AccountNumber= "+accountNumber+", Balance= "+currentBalance+" ]";
		
	}

}
