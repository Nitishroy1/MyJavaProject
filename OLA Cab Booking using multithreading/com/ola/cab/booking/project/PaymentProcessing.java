package com.ola.cab.booking.project;

public class PaymentProcessing implements Runnable{

	@Override
	public void run() {
		IO.println("Processing payment...");
		
		try {
			Thread.sleep(2000);
			IO.println("Payment successful!");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
