package com.coustomClassObj;

import java.util.Enumeration;
import java.util.Vector;

public class A {
	void main() {
		
//		Integer a=100;
//		Integer b=100;
//		IO.println(a==b);//true
//		Integer c=200;
//		Integer d=200;
//		IO.println(c==d);//fulse
		
		Vector<String> v= new Vector<String>();
		v.add("HYD");
		v.add("MUM");
		v.add("Del");
		v.add("DEB");
		Enumeration<String> element=v.elements();
		while(element.hasMoreElements()) {
			IO.println(element.nextElement());
		}
		
		Integer[] arr= {new Integer(1),new Integer(3)};
		Integer[] arr1= {new Integer(1),new Integer(3)};
	
		
		
		
		
		
	}

}
