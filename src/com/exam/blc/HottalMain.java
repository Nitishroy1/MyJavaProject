package com.exam.blc;
import java.util.*;

public class HottalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hottal scmart=new Hottal();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer name: ");
		String name=sc.nextLine();
		System.out.print("Enter Hotel name: ");
		String hotelName=sc.nextLine();
		System.out.print("Enter Room rate per day: ");
		double roomRant=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Number of days Stayed: ");
		int noOfday=Integer.parseInt(sc.nextLine());
		
		System.out.println("----Bill Summary------");
		System.out.println("customer name : "+name);
		System.out.println("Hotel Name: "+hotelName);
		System.out.println("Room Rate(Per day): "+roomRant);
		System.out.println("Days Stayed : "+noOfday);
		System.out.println("Total amount :"+scmart.calculateTotalAmount(roomRant, noOfday));
		System.out.println("Amount after Discount: "+scmart.calculateDiscountedAmount(noOfday,roomRant*noOfday));

	}

}
