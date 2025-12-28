package com.nitish.oop;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		Product laptop=new Product();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Product ID: ");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Product Name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter Product Price: ");
		double price= Double.parseDouble(sc.nextLine());
		
		System.out.println("-----Product Details----------");
		laptop.setProductDetails(id, name, price);
		System.out.println(laptop);
		laptop.calculateDiscount();
		sc.close();
		
		

	}

}
