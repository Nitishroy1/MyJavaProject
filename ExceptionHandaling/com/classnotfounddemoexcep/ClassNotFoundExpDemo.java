package com.classnotfounddemoexcep;

public class ClassNotFoundExpDemo {
	public ClassNotFoundExpDemo() {
		
	}
	public ClassNotFoundExpDemo(String className) {
		Class< ? > msg;
	
	try {
		msg=Class.forName(className);
		IO.println("Class loaded successfully: "+ msg.getName());
		
	}
	catch(ClassNotFoundException e) 
	{
		IO.println("Class not found: "+className);
		e.printStackTrace();
		
	}
	}
	void main() {
		String className=IO.readln("Enter fully qulified class name: ");
		new ClassNotFoundExpDemo(className);
		
	}
	
	
	}


