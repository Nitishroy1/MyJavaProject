package com.oops.constructors;

public class Car {
	private  String model;
	private int year;
	private double price;
	
    public Car(String model, int year,double price) {
    	
    	if(price<=0) {
    	   System.err.println("Price must be positive integer");
    	   System.exit(0);
    	}

    	
    	
       if( year<=2010) {
    		System.err.println("year must be greater than 2010");
    		System.exit(0);
    	}
       
        this.model=model;
    	this.year=year;
    	this.price=price;
		
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
    
}
