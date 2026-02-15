package com.ola.cab.booking.project;

public class LiveTracking implements Runnable {

	@Override
	public void run() {
		for(int i=20;i<=100;i+=20) {
			try {
				Thread.sleep(2000);
				IO.println("Updating ride location... "+i+"% completed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		IO.println("Ride completed!");
		
	}

}
