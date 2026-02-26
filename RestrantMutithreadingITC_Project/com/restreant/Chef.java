package com.restreant;

public class Chef extends Thread {
	private Restaurant restaurant;

	public Chef(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	
	@Override
	public void run() {
		IO.println("chef prepared Customer Order");
		restaurant.prepareOrder();
	}

}
