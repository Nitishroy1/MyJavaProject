package com.restreant;

public class Restaurant {
private	String name;
private	String order;
private	boolean isOrderReady=false;
	
	
	public Restaurant(String name) {
		super();
		this.name = name;
		
	}
	
	public synchronized void placeOrder(String order) {
		this.order=order;
		try {
			IO.println(" Waiter: Placed order for "+order);
			wait();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public synchronized void prepareOrder() {
		try {
			IO.println("chef will prepare "+order);
			Thread.sleep(3000);
			isOrderReady=true;
			IO.println("Chef: "+this.order+" is ready!");
			notify();
			IO.println("Waiter: Serving the "+this.order);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getRestaurantName() {
		return this.name;
	}
	
	

}
