package com.oops.constructors;

public class Rectangal {
	private double width;
	private double height;
	
	public Rectangal(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		if(width<0 || height<0) {
			System.err.println("Width and height must be non-negative.");
			System.exit(0);
		}
		
		return  height*width;
		
	}
	public double getPerimeter() {
		
		if(width<0 || height<0) {
			System.err.println("Width and height must be non-negative.");
			System.exit(0);
		}
		return 2*(height+width);
	}
	

}
