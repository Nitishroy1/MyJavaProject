package com.oops.constructors;
import java.util.*;
public class CarDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter car Model: ");
		String model=sc.nextLine();
		
		System.out.print("Enter Car Manufacturing Year : ");
		int year=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Car Price: ");
		double price=Double.parseDouble(sc.nextLine());
		
		Car toyota=new Car(model, year, price);
		System.out.println(toyota);
		sc.close();

	}

}
