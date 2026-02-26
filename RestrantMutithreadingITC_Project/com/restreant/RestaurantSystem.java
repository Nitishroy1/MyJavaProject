package com.restreant;

public class RestaurantSystem {
	void main() {
		Restaurant restaurant=new Restaurant("Welcome to KFC Restaurant!!!");
		IO.println(restaurant.getRestaurantName());
		Waiter waiter=new Waiter(restaurant);
		Chef chef=new Chef(restaurant);
		waiter.acceptOrder("fried chicken");
		waiter.start();
		chef.start();
	}

}
