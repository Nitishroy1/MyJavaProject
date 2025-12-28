package com.nitish.oop;
import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		Bank icici =new Bank();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Customer Data:  ");
		
		System.out.print("Enter Customer Name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter Account Number : ");
		int accountNum=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Opening Balance: ");
		double balance=Double.parseDouble(sc.nextLine());
		
		icici.setCustomerDeatils(name, accountNum, balance);
		
		while(true) {
			
		
		System.out.println("----------------MENu-----------------------");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check balance");
		System.out.println("4. Display Customer Details");
		System.out.println("5. Exit");
		
		System.out.print("Enter Your Choice: ");
		int choice=Integer.parseInt(sc.nextLine());
		
		
		switch (choice) {
		case 1 ->
		{
			System.out.print("Enter deposit  amount: ");
			int depositAmount=Integer.parseInt(sc.nextLine());
			icici.deposit(depositAmount);
			
		}
		case 2 ->
		{
			System.out.print("Enter Withdrawal amount: ");
			int withdrawlAmount=Integer.parseInt(sc.nextLine());
			icici.withdraw(withdrawlAmount);
		}
		case 3 ->{
			System.out.println("Current Balance: "+ icici.getCurrentBalance());
		}
		case 4->{
			System.out.println(icici.displayDetails());
		}
		case 5 ->{
			System.out.println("Exit.......!");
			sc.close();
			System.exit(0);
		}
		default->
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	
	  }
	 
	}
}
		
		

	


