package com.displayCake;

public class CakeOrder {

	public static void main(String[] args)
	{
		
		OrderedCake order=null;
		order=new OrderedCake();
		IO.println(order);
		
		String shape1=IO.readln("Enter shape name:");
		String flavor1=IO.readln("Enter flavor name:");
		int quantity1=Integer.parseInt(IO.readln("Enter quantity of cake:"));
		
		order= new OrderedCake(shape1, flavor1, quantity1);
		IO.println(order);
		
		String shape2=IO.readln("Enter shape name:");
		String flavor2=IO.readln("Enter flavor name:");
		int quantity2=Integer.parseInt(IO.readln("Enter quantity of cake:"));
		String message=IO.readln("Enter Happy Birthday Message: ");
		order= new OrderedCake(shape2, flavor2, quantity2,message);
		IO.println(order);
		

	}

}
