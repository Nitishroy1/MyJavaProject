package com.linkedlistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public class LinkedlistDemo1 {
	void main() 
	{
	LinkedList<Object> list= new LinkedList<>();
	list.add("hyd");
	list.add("dbg");
	list.add("dil");
	list.add(10);
	list.add(13);
	list.add(14);
	list.add(10);
	list.add(1,13);
	//list.forEach(System.out::println);
	list.add(1,"patna");
//	list.forEach(System.out::println);
	list.addFirst("Nitish");
	list.addLast("kumar");
	list.forEach(System.out::println);
	ListIterator<Object> it=list.listIterator();
	
	while(it.hasNext()) {
		Object value=it.next();
		if(value.equals("hyd")) {
			it.remove();;
		}
		else if(value.equals("dil")) {
			it.set("pushpa");
		}
		else if(value.equals("kumar")) {
			it.add("yadav");
		}
		
	}
	//it.forEachRemaining(System.out::println);
	IO.println("_______________________");
	list.forEach(System.out::println);
	IO.println("_______________________");
	list.removeFirstOccurrence(Integer.valueOf(13));
	IO.println(list.lastIndexOf(Integer.valueOf(10)));
	list.forEach(System.out::println);
		
	
	
	List<String> listOfname=Arrays.asList("ravi","nitish","pushapa","rajnish");
    LinkedList<String> listOfn=new LinkedList<String>(listOfname);
    UnaryOperator<String> convertToCAp=str -> str.toUpperCase();
    listOfn.replaceAll(convertToCAp);
    listOfn.forEach(System.out::println);
	}
	

}
