package com.TreeSet_programe;

import java.util.TreeSet;

record Book(String name,String author) implements Comparable<Book>{
	@Override
	public int compareTo(Book o) {
		
		return this.name().compareTo(o.name());
	}
	
}

public class Bookdemo {
	void main() {
		TreeSet<Book> book=new TreeSet<Book>();
		book.add(new Book("java","jeams joslay"));
		book.add(new Book("c","Nitish"));
		book.add(new Book("C++","mohan"));
		book.forEach(IO::println);
		
	}

}
