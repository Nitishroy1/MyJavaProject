package com.nitish.elc;
import java.util.Scanner;

import com.nitish.blc.ProductCar;

public class ProductCarMain {

	public static void main(String[] args) {
		
		ProductCar car=new ProductCar();
		
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Product Id: ");
		int productID=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Product Name: ");
		String productName=sc.nextLine();
		System.out.print("Enter Product Price: ");
		double productPrice=Double.parseDouble(sc.nextLine());
		
		car.setProductData(productID,productName, productPrice);
		car.getProductData();
        sc.close();
	}

}
