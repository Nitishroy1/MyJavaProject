package com.nitish.elc;
import java.util.*;

import com.nitish.blc.Discount;

public class TotalBill {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Customer Name:");
		String comName= sc.nextLine();
		System.out.print("Enter Total Bill Amount:");
		int billAmount= sc.nextInt();
		System.out.println("-------Bill SUMMARY-----");
		System.out.println("Customer Name:"+comName);
		System.out.println("Original Bill:"+billAmount);
		
		System.out.println("Amount Payable after Discount:" +Discount.calculateDiscount(billAmount));
		
	}

}
