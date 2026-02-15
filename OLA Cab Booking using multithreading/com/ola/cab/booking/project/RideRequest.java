package com.ola.cab.booking.project;

public class RideRequest implements Runnable {

	@Override
	public void run() {
		IO.println("User requested a ride...");
		
		try {
			Thread.sleep(2000);
			IO.println("Searching for nearby drivers...");
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
