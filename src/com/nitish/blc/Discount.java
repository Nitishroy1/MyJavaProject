package com.nitish.blc;

public class Discount {
	public static double calculateDiscount(int billAmount) {
		if(billAmount>=5000) {
		double newBillAmount= billAmount- billAmount*0.20;
		return newBillAmount;
		}
		
		else if(billAmount>=3000) {
			double newBillAmount= billAmount- billAmount*0.15;
			return newBillAmount;
			}
		else if(billAmount>=1000) {
			double newBillAmount= billAmount- billAmount*0.10;
			return newBillAmount;
			}
		else {
			double newBillAmount= billAmount- billAmount*0.05;
			return newBillAmount;
			}
		
		
		
	}

}
