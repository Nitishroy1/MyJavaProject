package com.exceptionhandaling;

public class ExceptionHandlingDemo {
	void main() {
		//String str= IO.readln("Enter a string value: ");
		String str=null;
		handleExceptions(str);
	}
	
	public static void handleExceptions(String msg) {
		try {
			IO.println("Length of the input string: "+msg.length());
			Integer num= Integer.valueOf(msg);
			IO.println("Converted to integer:"+num);
			IO.println("Uppercase version: "+msg.toUpperCase());
		}
		catch (NumberFormatException | NullPointerException e) {
			if(e instanceof NumberFormatException) {
			IO.println("NumberFormatException Input in not a Right formate");
			}
			if(e instanceof NullPointerException) {
				IO.println("NullPointerException can't call a method when a refrance pointing to null");
			}
		}
		
	}
	

}
