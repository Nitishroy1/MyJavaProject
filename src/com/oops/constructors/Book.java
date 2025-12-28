package com.oops.constructors;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) {
		super();
		if(price<=0) {
			System.err.println("Error : Book Price cannot be negative.");
			System.exit(0);
		}
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public void applyDiscount(double discountPercentage) {
		
		if(discountPercentage<=0) {
			System.err.println("Error: Invalid discount percentage.");
		}
		else {
		price= price-price*(discountPercentage/100);
		}
			
		}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

		
	}
	


