package com.rectangleArea;

public class AreaCalculator {
	public static void main(String[] args) {
		try {
			double length= Double.parseDouble(IO.readln("Enter length of rectangal: "));
			double width= Double.parseDouble(IO.readln("Enter width of rectangal: "));
			IO.print("Area of rectangle with length "+length+"  and width "+ width + " is:"+calculateArea(length, width));
		} 
		catch (Exception e) {
			IO.println(e.toString());
			
		}
		
	}
	
	public static double calculateArea(double length,double width) throws IllegalArgumentException 
	{
		if(length<=0 || width<=0) {
			throw new IllegalArgumentException("Length and width must be > 0.");
		}
		double area= length* width;
		return area;
	  }
	  
	  
		
		
		
	}