package com.library.management.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;
public class Library {
	private ArrayList<Book> books;
	
	public Library() {
		this.books=new ArrayList<Book>();
	}
	
	
	//method add Book object
	public void addBook(Book book) {
		boolean isExit=false;
		for(Book book1: books) {
			if(book1.getIsbn()==book.getIsbn()) {
				IO.println("Book with the same ISBN "+book.getIsbn()+" already exists.");
				isExit=true;
			}
			
		}
		if(!isExit) 
		{
			books.add(book);
			IO.println("Book added successfully.");
			
		}
		
	}
	//helper method 
	private Book searchBookByISBN(long isbn) 
	{
		
	 for(Book book1: books) {
		 if(book1.getIsbn()==isbn) {
			
			return book1;
		 }
	 }
	 
	 return null;
	}
	
	
	//displayAllBooks()
	public void displayAllBooks() 
	{
		 if (books.isEmpty()) {
	            IO.println("No books available in library.");
	            return;
	        }
	 for(Book book1: books) {
		 IO.println(book1.displayBook());
	 }
	}
	//updateBookQuantityByISBN()
	public void updateBookQuantityByISBN(long isbn) {
		Book book=searchBookByISBN(isbn);
		if(book==null) {
			IO.println("Invalide isbn number");
			return;
		}
		IO.println("Updating quantity of book : ");
		int updateQuentity= Integer.parseInt(IO.readln("Enter quentity to Add: "));
		if(updateQuentity<=0) {
			IO.println("Error: Quantity cannot be zero or negative.");
			return;
		}
		book.setQuantity(updateQuentity);
		IO.println("Book quantity updated successfully.");
		
	}
	//deleteBookByTitle()
	public void deleteBookByTitle(String title) 
	{
	  if(title.isBlank()||title==null) {
		  IO.println("Book Title cannot be blank");
		  return;
		  
	  }
	  ListIterator<Book> it=books.listIterator();
	  boolean isDelet=false;
	  while(it.hasNext()) {
		  Book book=it.next();
		  if(book.getTital().equals(title)) 
		  {
			 it.remove();  
			 IO.println("delete successfully.");
			 isDelet=true;
			 return;
		  }
		  
	  }
	  if(!isDelet) {
		  IO.println("Book with tital "+ title+" will not avalbal");
	  }
	  
	}

}
