package com.oops.constructors;
import java.util.*;

public class RectangalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter height and width of a rectangal: ");
		System.out.print("width : ");
		double width=Double.parseDouble(sc.nextLine());
		
		System.out.print("Height: ");
		double height= Double.parseDouble(sc.nextLine());
		Rectangal r1=new Rectangal(width, height);
		System.out.println("Area of Rectangal: "+r1.getArea());
		System.out.println("Parimeter of rectangal: "+r1.getPerimeter());
		sc.close();
		
		

	}

}
