package com.nitish.elc;
import java.util.*;

import com.nitish.blc.Circle;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a raduse:");
		int radius= sc.nextInt();
		System.out.println("area of circle:"+Circle.getArea(radius));
        sc.close();
	}

}
