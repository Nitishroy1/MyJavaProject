package com.ola.cab.booking.project;

public class OlaRidingApp {
void main() {
	Thread t1=new Thread(new RideRequest());
	Thread t2=new Thread(new DriverAssignment());
	Thread t3=new Thread(new FareCalculation());
	Thread t4=new Thread(new LiveTracking());
	Thread t5=new Thread(new PaymentProcessing());
	Thread t6=new Thread(new RatingSystem());
	
	t1.start();
	t3.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t2.start();
	
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	t4.start();
	try {
		t4.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t5.start();
	try {
		t5.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t6.start();
}
}
