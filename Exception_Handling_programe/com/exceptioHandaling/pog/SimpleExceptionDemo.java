package com.exceptioHandaling.pog;

public class SimpleExceptionDemo {
	void main() {
		try {
		int a=Integer.parseInt(IO.readln("Enter the first integer (a): "));
		int b=Integer.parseInt(IO.readln("Enter the first integer (b): "));
		IO.println(a+b);
		}
		catch (NumberFormatException e) {
			IO.println(e.getMessage());
			IO.println(e.toString());
			IO.println("NumberFormatException occurred. Please enter only integer numbers.");
			e.printStackTrace();
		}
		
	}

}
