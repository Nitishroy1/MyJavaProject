package com.exceptionhandaling;

public class ArithmeticExceptionDemo {
	void main() {
		int a =Integer.parseInt(IO.readln("Enter dividend : "));
		int b=Integer.parseInt(IO.readln("Enter divisor :"));
		try 
		{
			IO.println("Result of division : "+performDivision(a, b));
		} 
		catch ( ArithmeticException e) {
			IO.println("ArithmeticException caught: Division by zero:");
			IO.println("dividend="+a+", divisor= "+b);
		}
		
	}
	public static int  performDivision(int a, int b) throws ArithmeticException
	{
		int div= a/b;
		return div;
	}

}
