package com.TreeSet_programe;

import java.util.Iterator;
import java.util.TreeSet;

record Product(Integer pid, String pname) {
	
	public Product{
		
			
			if(pid<=0) {
				throw new IllegalArgumentException("PID can't be zero or Negative");
			}
		
	}
	
	
}

public class TreeSet_demo {
	void main() {
		TreeSet<Product> product=new TreeSet<Product>((t1,t2)-> t2.pid().compareTo(t1.pid()));
//		Integer pid=Integer.parseInt(IO.readln("Enter PID No: "));
//		String pname=IO.readln("Enter product Name: ");
		product.add(new Product(101,"mobile"));
		product.add(new Product(102,"camra"));
		product.add(new Product(108,"laptop"));
		product.add(new Product(105,"dasktop"));
		product.add(new Product(109,"cable"));
		product.forEach(IO::println);
		IO.println("-----------------------------");
//		Iterator<Product> itr=product.descendingIterator();
//		while(itr.hasNext()) {
//			IO.println(itr.next());
//		}
		
		TreeSet<Product> product2=new TreeSet<Product>((t1,t2)-> t2.pname().compareTo(t1.pname()));
		product2.add(new Product(101,"mobile"));
		product2.add(new Product(102,"camra"));
		product2.add(new Product(108,"laptop"));
		product2.add(new Product(105,"dasktop"));
		product2.add(new Product(109,"cable"));
		product2.forEach(IO::println);
	}

}
