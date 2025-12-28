package com.nitish.oop;

import org.w3c.dom.ls.LSOutput;

public class Fan {
	String name;
	String coil;
	int wings;
	
	public void switchOn() {
		
       System.out.println("Fan name is :"+name);
       System.out.println("fan coile is :"+coil);
       System.out.println("no of wings in fan is :"+wings);
       

	}
	
	
	public void switchOff() {
		System.out.println("fan name is: "+name+": off");
		System.out.println("fan coil is "+coil+" off");
		System.out.println(wings+" no of wings of fan is off");
		
	}

}
