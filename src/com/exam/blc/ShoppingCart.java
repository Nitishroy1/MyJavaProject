package com.exam.blc;
import java.util.*;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount billAmount=new Discount();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		 String name= sc.nextLine();
		System.out.print("Enter your bill amount: ");
		double billAmount1=sc.nextDouble();
		System.out.println("--------Bill Summary------");
		System.out.println("Custommer name:"+name);
		System.out.println("Original Bill:"+billAmount1);
		System.out.println("Amount Payable after Discount: "+billAmount.calculatDiscount(billAmount1));

	}

}
