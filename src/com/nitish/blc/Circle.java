package com.nitish.blc;

public class Circle {
	public static String getArea(int radus) {
		if(radus<=0) {
			return ""+0;
		}
		final double PI=3.14;
		return ""+ PI*(radus*radus);
	}

}
