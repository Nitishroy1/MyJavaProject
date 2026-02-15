package com.ola.cab.booking.project;

public class RatingSystem implements Runnable{

	@Override
	public void run() {
      IO.println("Requesting user rating...");
      
      try {
		Thread.sleep(1000);
		IO.println("User rated the ride: 5 star");
	} 
      catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	

}
