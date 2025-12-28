package com.exceptionhandaling;

public class ClassCastExceptionDemo {
	void main() {
		handleClassCastException();
	}
	public static void handleClassCastException() {
		//int num=Integer.parseInt(IO.readln("Enter arraya size: "));
		Object[] obj=new Object[3];
		
		try {
		
		for(int i=0;i<obj.length;i++) {
			
			String input=IO.readln("Enter object "+(i+1)+": ");
			if(!(input instanceof String)) {
				throw new ClassCastException();
			}
			obj[i]=input;
		}
		}
		catch (ClassCastException e) {
		   IO.println("ClassCastException: Cannot cast java.lang.Integer to String.");
		   e.printStackTrace();
		}
		for(Object obj1 : obj) {
			IO.println("Casting successful: "+ obj1);
		}
	}

}
