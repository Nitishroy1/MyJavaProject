package com.arrayList.cCass.prog;

public record Customer(int custId, String custrName,String picLoc,String dropLoc,int distance, String phone) {
	public Customer{
		try 
		{
		if(custId<0) {
			
			throw new IllegalArgumentException("Validation Error: Customer ID must be positive.");
		}
		if(custrName.isBlank()|| custrName==null) {
			throw new IllegalArgumentException("Validation Error: Customer name cannot be null or blank.");
		}
		if(picLoc.isBlank()|| picLoc==null) {
			throw new IllegalArgumentException("Validation Error: Pickup location cannot be null or blank.");
		}
		if(dropLoc.isBlank()|| dropLoc==null) {
			throw new IllegalArgumentException("Validation Error: Drop location cannot be null or blank.");
		}
		if(distance<0) {
			throw new IllegalArgumentException("Validation Error: Distance cannot be negative.");
		}
		if(phone.length()<10||phone.length()>10) {
			throw new IllegalArgumentException("Validation Error: Phone number must be 10 digits only.");
		}
		}
		catch(Exception e) {
			IO.println(e.getMessage());
		}
	}

}
