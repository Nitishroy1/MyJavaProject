package com.compratore;

import java.util.Collections;
import java.util.Vector;

public class CustomerComparator {
	void main() {
		Vector<Customer> listOfCustomer=new Vector<Customer>();
		listOfCustomer.add(new Customer(101,"Smith",2500d));
		listOfCustomer.add(new Customer(103,"Jon",2300d));
		listOfCustomer.add(new Customer(102,"Miller",260d));
		listOfCustomer.add(new Customer(106,"Miller",260d));
		IO.println("Array Sort in Assinding Order:");
		Collections.sort(listOfCustomer, (c1,c2)-> Integer.compare(c1.id(), c2.id()));
//		for(Customer cus: listOfCustomer) {
//			IO.println(cus);
//		}
		IO.println("Array Sort in desinding order: ");
		Collections.sort(listOfCustomer, (c1,c2)-> Integer.compare(c2.id(), c1.id()));
		//listOfCustomer.forEach(y->IO.println(y));
		
		IO.println("Array Sort in based on the Customer Name:");
		Collections.sort(listOfCustomer, (c1,c2)->c1.name().compareTo(c2.name()));
		listOfCustomer.forEach(y->IO.println(y));
		
		IO.println("Array Sort in based on the Customer bill:");
		Collections.sort(listOfCustomer, (c1,c2)-> Double.compare(c1.bill(), c2.bill()));
		listOfCustomer.forEach(y-> IO.println(y));
	}

}
