package com.ola.cab.booking.project;

public class FareCalculation implements Runnable {

	@Override
	public void run() {
		IO.println("Calculating estimated fare..");
		try {
			Thread.sleep(1500);
			IO.println("Estimated fare: 135.75 RS.");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
