package com.collection.asin;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Library {
	public void displayAvailableBooks(Vector<Book> book ) {
        
		book.forEach(book1->IO.println(book1));
	}
	
	public void issueBook(Vector<Book> book,Scanner sc) {
		Integer id=Integer.parseInt(IO.readln("Enter Book id which for Book issue: "));
		ListIterator<Book> it=book.listIterator();
		boolean isfound= false;
		while(it.hasNext()) {
			Book book1=it.next();
			if(book1.id().equals(id)) {
				IO.println("Book with ID "+id+" issue");
				it.remove();
				isfound=true;
				break;
				
			}
			
		}
		if(!(isfound)) {
			
		IO.println("Book with ID "+id+" not found");
		}
	}
		
	
	public void searchBook(Vector<Book> book,Scanner sc) {
		String keyString=IO.readln("Enter keyword to search by title or author:");
		boolean isfound=false;
		for(Book book1: book) {
			if(book1.name().equalsIgnoreCase(keyString)|| book1.author().equals(keyString)) {
				IO.println("Found: "+ book1);
				isfound=true;
			}
		}
		if(!(isfound)) {
			IO.println("No matching books found.");
		}
		
		
	}

}
