package com.interface1.products;

public class PhysicalProduct extends Product {
	private double shippingWeight;

	public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
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
		
		return getPrice()*0.08;
	}
	
	public double calculateShippingCost() {
		return this.shippingWeight* 5;
	}

	@Override
	public String toString() {
		return "Physical Product\n"+super.toString()+"\nshipping Weight: " + shippingWeight;
	}
	

}
