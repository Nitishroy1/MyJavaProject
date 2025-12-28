package com.exam.blc;

public class Hottal {
	double totalBill;
	
	public double calculateTotalAmount(double roomRate, int days) {
		//In this method calculate total room rent (roomRate * days)
		totalBill= roomRate*days;
		return totalBill;
	}
	
  public double calculateDiscountedAmount(int days, double totalAmount) {
	  //calculateDiscountedAmount
	  if(days<=2) {
		  return totalAmount;
	  }
	  else if(days<=4) {
		  return totalAmount-(totalAmount*0.05);
	  }
	  else if(days<=9) {
		  return totalAmount-(totalAmount*0.1);
	  }
	  else {
		  return totalAmount-(totalAmount*0.2);
	  }
	  
	  
	
}
}
