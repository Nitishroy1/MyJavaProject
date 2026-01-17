package com.collection_retrive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class VectorA {
	void main() {
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(1);
		list.add(4);
		list.add(20);
		list.add(6);
		//list.sort((t1,t2)-> Integer.compare(t1, t2));
		//list.forEach(System.out::println);
		list.sort((t1,t2)-> Integer.compare(t2, t1));
		list.forEach(System.out::println);
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext()) {
			int n=it.next();
			if(n%2==0) {
				//it.remove();
			}
		}
		IO.println("------------------------");
		list.forEach(System.out::println);
		IO.println("------------------------");
		
		List<Integer> li= list.subList(2, 4);
		li.forEach(System.out::println);
		IO.println("------------------------");
		if(list.contains(10)) {
			int d= list.indexOf(10);
			list.add(d,100);
		}
		list.forEach(System.out::println);
		
	}

}
