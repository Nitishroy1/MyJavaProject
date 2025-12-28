package com.oop.copyConstructor;

public class Car {
	private String brand;
	private String model;
	private int year;
	private Driver driver;
	public Car(String brand, String model, int year, Driver driver) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	
	// Deep copy constructor
	public Car(Car other) {
		if (other == null) {
			throw new IllegalArgumentException("Car to copy cannot be null");
		}
		this.brand = other.brand;
		this.model = other.model;
		this.year = other.year;
		this.driver = (other.driver == null) ? null : new Driver(other.driver.getName(), other.driver.getAge());
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public void changeDriver(Driver newDriver) {
		
		this.driver=newDriver;
		
	}
	
	

}