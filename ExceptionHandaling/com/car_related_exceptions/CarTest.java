package com.car_related_exceptions;

public class CarTest {
	
	public static void stop(String stop) throws CarStoppedException
	{
		try {
		if(stop.equalsIgnoreCase("stop")) {
			throw new CarStoppedException("car not stop");
		}
		}
		catch (CarStoppedException e) {
			IO.println(e.getMessage());
		}
		
	}
	public static void puncture(String puncture) throws CarPunctureException
	{
		if(puncture.equalsIgnoreCase("puncture")) {
			throw new CarPunctureException("Car is punctured ");
		}
		
	}
	public static void carHeat(int carHeat) throws CarHeatException
	{
		if(carHeat > 50) {
			throw new CarHeatException("Car is heated more the 50 degrees");
		}
		
	}

}
