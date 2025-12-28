package com.oops.constructors;
import java.util.*;

public class LoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Lone Amount : ");
		
		double principalAmount=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Interest Rate: ");
		double interestRate=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter number of months for Loan: ");
		int durationmonth= Integer.parseInt(sc.nextLine());
		
		Lone l1=new Lone(principalAmount, interestRate, durationmonth);
		System.out.println(l1);
		
	     l1.calculateSimpleInterest();
	     
	    sc.close();

	}

}
