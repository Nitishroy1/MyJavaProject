package com.nitish.blc;
import java.util.*;

public class Product {
	int productId;
	String productName;
	double productPrice;
	
    public void setProductData() {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Product Id: ");
    	productId= Integer.parseInt(sc.nextLine());
    	System.out.print("Enter Product Name: ");
    	productName=sc.nextLine();
    	System.out.print("Enter Product price: ");
    	productPrice= Double.parseDouble(sc.nextLine());
    	sc.close();
    	
		
	}
    
    public void getProductData() {
    	System.out.println("Prodect Id is: "+productId);
    	System.out.println("Product Name is: "+productName);
    	System.out.println("Product price is: "+productPrice);
		
	}
   
}
