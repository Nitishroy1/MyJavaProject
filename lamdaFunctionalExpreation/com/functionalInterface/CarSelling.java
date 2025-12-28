package com.functionalInterface;

import java.util.function.Predicate;

record Car(String brand, Double price, Integer mileage) {
	
}

public class CarSelling {
	void main() {
		String brand=IO.readln("Enter Car Brand : ");
		Double price=Double.parseDouble(IO.readln("Enter car price: "));
		Integer mileage= Integer.parseInt(IO.readln("Enter mileage:"));
		Car car1= new Car(brand, price, mileage);
		
		Predicate<Car> p1= (car)->
		car.price()<=500000 && car.mileage()>=20;
		if(p1.test(car1)) {
			IO.println(car1.brand()+" is eligible for sale");
		}
		else {
			IO.println(car1.brand()+" is not eligible for sale");
		}
	}
	

}
