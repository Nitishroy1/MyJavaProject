package com.nitish.blc;

public class ToDigitDiffrence {
	public static int grtDiffOfDigits(int num) {
		int firstDig= num/10-num%10;
//		int secDig=num%10;
//		int diff=firstDig-secDig;
		//return diff;
		return firstDig;
	}

}
