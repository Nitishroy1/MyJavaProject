package com.oops.constructors;
 import java.util.*;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Title: ");
		String tital=sc.nextLine();
		
		System.out.print("Author: ");
		String author=sc.nextLine();
		
		System.out.print("Price: ");
		double price=Double.parseDouble(sc.nextLine());
		if(price<=0) {
			System.err.println("Book Price Can't be 0 Or negative: ");
		}
		
		
		System.out.print("Discount in %: ");
		double discount=Double.parseDouble(sc.nextLine());
		
		
		Book pk= new Book(tital, author, price);
		
		pk.applyDiscount(discount);
		
		System.out.println(pk);
		sc.close();
		
	}
	
			
     
	}
	


