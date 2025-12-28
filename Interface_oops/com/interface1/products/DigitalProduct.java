package com.interface1.products;

public class DigitalProduct extends Product {
	private String licenseKey;

	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	}

	@Override
	public void applyDiscount(double percentage) {
		double totalDisc=(this.getPrice()*percentage)/100;
		setPrice(getPrice()-totalDisc);
		IO.println("Discount applied: "+totalDisc);
		IO.println("New Updated Price: "+this.getPrice());
		
		
	}

	@Override
	public double calaulateTax() {
		
		return getPrice()*0.05;
	}

	@Override
	public String toString() {
		return "Digital Product:\n"+super.toString()+"\nLicense Key: " + licenseKey;
	}
	
	
	
	
	

}
