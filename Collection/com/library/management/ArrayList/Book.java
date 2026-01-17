package com.library.management.ArrayList;

public class Book {
	private String tital;
	private String author;
	private  long isbn;
	private double peice; 
	private int quantity;
	public Book(String tital, String author, long isbn, double peice, int quantity) {
		super();
		this.tital = tital;
		this.author = author;
		this.isbn = isbn;
		this.peice = peice;
		this.quantity = quantity;
	}
	public String getTital() {
		return tital;
	}
	public void setTital(String tital) {
		this.tital = tital;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public double getPeice() {
		return peice;
	}
	public void setPeice(double peice) {
		this.peice = peice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "Book [tital=" + tital + ", author=" + author + ", isbn=" + isbn + ", peice=" + peice + ", quantity="
				+ quantity + "]";
	}
	public String displayBook() {
		return this.toString();
	}
	

}
