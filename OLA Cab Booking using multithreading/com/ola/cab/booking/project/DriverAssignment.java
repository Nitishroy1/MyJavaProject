package com.ola.cab.booking.project;

public class DriverAssignment implements Runnable{

	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
            IO.println("Driver found and assigned!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
