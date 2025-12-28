package com.displayCake;

public abstract class Cake {
	private String shape;
	private String flavor;
	private int quantity;
	public static double price=400;
	public Cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "A " + shape +" " + flavor + " Cake of "+ quantity + " KG is Ready @ Rs."+(price*quantity);
	}
	
}
class OrderedCake extends Cake{
	private String message;
	
	
   
	public OrderedCake() {
		super("Round","Vanila",1);
		
		
	}

	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape, flavor, quantity);
	}

	public OrderedCake(String shape, String flavor, int quantity, String message) {
		super(shape, flavor, quantity);
		this.message = message;
	}
	@Override
	public String toString() {
		if(message!=null) {
		return "A " + getShape() +" " + getFlavor() + " Cake of "+ getQuantity() + " KG is Ready with "+ message + " @ Rs."+(price*getQuantity());
	}
     return super.toString();
	
	
	
}
}
