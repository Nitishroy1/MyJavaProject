package com.exam.blc;

public class Discount {
	 
	public double calculatDiscount(double billAmount) {
		
		if(billAmount>=5000) {
			double newBill=billAmount-(billAmount*0.2);
			return newBill;
		}
		else if(billAmount>=3000) {
			double newBill=billAmount-(billAmount*0.15);
			return newBill;
		}
		else if(billAmount>=1000) {
			double newBill=billAmount-(billAmount*0.1);
			return newBill;
		}
		
		else {
			return billAmount-(billAmount*0.05);
		}
	}

}
