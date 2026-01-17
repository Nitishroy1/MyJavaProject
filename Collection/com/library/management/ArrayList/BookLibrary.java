package com.library.management.ArrayList;

public class BookLibrary {
	void main() 
	{
	Library library=new Library();
	while(true) {
		IO.println("-----------Index---------------------");
		IO.println("1. Add Book");
		IO.println("2. Displaye Books");
		IO.println("3. Update Quantity");
		IO.println("4. Delete Book");
		IO.println("5. Exit");
		int choice= Integer.parseInt(IO.readln("Choose an option: "));
	
		switch(choice) {
		case 1 -> 
		{ 
			char ch;
			do{
				
			String title=IO.readln("Enter Title: ");
			String author=IO.readln("Enter Author: ");
			long isbn=Long.parseLong(IO.readln("Enter ISBN: "));
			double price= Double.parseDouble(IO.readln("Enter Price: "));
			int  qunt=Integer.parseInt(IO.readln("Enter Quantity: "));
			
			library.addBook(new Book(title, author, isbn, price, qunt));
			ch = IO.readln("Add more book [yes/no]: ")
	                .trim()
	                .toLowerCase()
	                .charAt(0);
			}
			while(ch=='y'); 
			
		}
		case 2 ->{
			library.displayAllBooks();
		}
		case 3 ->{
			long isbn=Long.parseLong(IO.readln("Enter ISBN:"));
			library.updateBookQuantityByISBN(isbn);
		}
		case 4->{
			String tital=IO.readln("Enter Book Title: ");
			library.deleteBookByTitle(tital);
		}
		case 5->{
			IO.println("Exiting from the Application. Thank you!!!");
			System.exit(0);
		}
		}
	}
	}

}
