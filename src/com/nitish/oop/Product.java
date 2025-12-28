package com.nitish.oop;

public class Product {
	private int id;
	private String name;
	private double price;
	
	//methods1
	public void setProductDetails(int id,String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
	//method2
	public void calculateDiscount() {
		double discount=0;
		
		if(this.price<1000) {
			discount=(price*0.05);
			price=price-discount;
		}
		else if(this.price<=5000) {
			discount=(price*0.1);
			price=price-discount;
		}
		else {

			discount=(price*0.15);
			price=price-discount;
		}
		System.out.println("Discount Amount: "+discount);
		System.out.println("Price after Discount: "+ this.price);
		
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
