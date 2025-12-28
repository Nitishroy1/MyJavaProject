package com.methodreturnTypeasAIntergace;

public class PrinterDemo {
	public Printer getPrinter() 
	{
	 return new Printer() {
			@Override
			public void print() {
				IO.println("anonymous inner class Print");
				
			}
			public void m1() {
				IO.println("my name is nitish");
				
			}
			
			
		};
		
		
		
		
	}

}
