package com.nitish.blc;

public class ProductCar {
	
		int productId;
		String productName;
		double productPrice;
		
	    public void setProductData(int id, String name, double price)
	    {
	     productId=id;
	     productName=name;
	     productPrice=price;
			
		}
	    public void getProductData() 
	    {
	    	System.out.println("Prodect Id is: "+productId);
	    	System.out.println("Product Name is: "+productName);
	    	System.out.println("Product price is: "+productPrice);
			
		}
	}



