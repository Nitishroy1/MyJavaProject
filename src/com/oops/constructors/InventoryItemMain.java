package com.oops.constructors;
import java.util.*;

public class InventoryItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Item Name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter Price Per Unit: ");
		double price=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Quantity In Stock: ");
		int stock=Integer.parseInt(sc.nextLine());
		
		InventoryItem item1=new InventoryItem(name, price, stock);
		
		System.out.println("-------Inventory Item Details--------");
		item1.getInfo();
		System.out.print("Any updation in Stock Price OR Quantity :Yes/No: ");
		String choice=sc.nextLine();
		
		if(choice.equalsIgnoreCase("no")) {
			System.exit(0);
			
		}
		
		System.out.print("Enter New Price Per Unit: ");
		double newPrice=Double.parseDouble(sc.nextLine());
		item1.setPricePerUnit(newPrice);
		System.out.print("Enter New Quantity In Stock:");
		int newStock=Integer.parseInt(sc.nextLine());
		item1.setQuantityInstock(newStock);
		System.out.println("-----Updated Inventory Item Details:----------");
		item1.getInfo();
		
		
		

	}
}
}
