package com.opp.constructor.passByValue;


public class PassByValue {
    private String name;
    private double height;
    
    
	public PassByValue(String name, double d) {
		super();
		this.name = name;
		this.height = d;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}

	
	@Override
	public String toString() {
		return "PassByValue [name=" + name + ", height=" + height + "]";
	}
	
	
    
    
}
