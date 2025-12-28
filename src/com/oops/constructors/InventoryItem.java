package com.oops.constructors;

public class InventoryItem {
	private String itemName;
	private double pricePerUnit;
	private int quantityInstock;
	
	public InventoryItem(String itemName, double pricePerUnit, int quantityInstock) {
		super();
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInstock = quantityInstock;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantityInstock() {
		return quantityInstock;
	}

	public void setQuantityInstock(int quantityInstock) {
		this.quantityInstock = quantityInstock;
	}
	
	public double calculateTotalValue() {
		return pricePerUnit*quantityInstock;
		
	}
	
	public void getInfo() {
		System.out.println("Item Name: "+itemName);
		System.out.println("Price Per Unit: "+pricePerUnit);
		System.out.println("Quantity in Stock: "+quantityInstock);
		System.out.println("Total Inventory Value : "+calculateTotalValue());
		
	}
	
	
	

}
