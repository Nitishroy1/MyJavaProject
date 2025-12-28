package com.nitish.blc;

public class TwoDigitsSum {
   public static int getSumOfDigits(int num) {
	   int sum =0;
	   sum=num%10+num/10;
	   return sum;
	   
	   
   }
}
