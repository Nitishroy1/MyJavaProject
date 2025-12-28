package com.interface1.products;

public abstract class Product {
	private String name;
	private double price;
	private String category;
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public abstract void applyDiscount(double percentage);
	public abstract double calaulateTax();
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product Name: " + name +"\nCategory: " + category + "\nPrice RS: " + price;
	}
	
	
	

}
