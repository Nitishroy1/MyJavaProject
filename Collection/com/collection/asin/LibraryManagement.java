package com.collection.asin;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement {
	@SuppressWarnings("null")
	void main() {
		Vector<Book> book=new Vector<Book>();
		book.add(new Book(101,"Core java", "Mr James"));
		book.add(new Book(102,"Adv java", "Mr Robert"));
		book.add(new Book(103,"Head First java", " Miss Kathy Sierra"));
		book.add(new Book(104,"Programming in C ", "Mr Denis"));
		
		
		Library library=new Library();
		
		
	    while(true) {
	    	IO.println("Select from the Menu");
			IO.println("\t1) Display Books Available in the Library :");
			IO.println("\t2) Search a Book in the Library :");
			IO.println("\t3) Issue a Book from the Library :");
			IO.println("\t4) Exit from the application :");
			int choice=Integer.parseInt(IO.readln("Please Enter your Choice: "));
			Scanner sc=new Scanner(System.in);
	    	if(choice==1) {
	    		library.displayAvailableBooks(book);
	    	}
	    	else if(choice==2) {
	    		 
	    		library.searchBook(book, sc);
	    	}
	    	else if(choice==3) {
	    		
	    		library.issueBook(book, sc);
	    	}
	    	else if(choice==4) {
	    		IO.println("programe End");
	    		System.exit(0);
	    	}
	    	
	    }
		
	}

}
