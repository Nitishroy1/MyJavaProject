package com.method_overriding_shoping_mall;

public class ShoppingMall {

	public static void main(String[] args) {
		Customer customer=null;
		IO.println("Please select the Customer Type to get additional Discount :");
		IO.println("\t\t\t 1) General Customer..");
		IO.println("\t\t\t 2) Prime Customer..");
		IO.println("\t\t\t 3) VIP Customer..");
		int choice=Integer.parseInt(IO.readln("Please enter Customer type : "));
		
		switch(choice) {
		case 1 ->{
			
			String name= IO.readln("Please Enter your Name :");
			int noOfItem=Integer.parseInt(IO.readln("Enter number of Items :"));
			IO.println("Please Enter the Item Name and Price");
			double prices[]=new double[noOfItem];
			for(int i=0;i<prices.length;i++) {
				IO.print(i+1+") Item Name: ");
				String itemName=IO.readln();
				IO.print("Item Price: ");
				double itemprice=Integer.parseInt(IO.readln());
				prices[i]=itemprice;
			}
			customer=new GeneralCustomer(name);
			generateBill(customer, prices);
			
		}
		case 2 ->{
			
			String name= IO.readln("Please Enter your Name :");
			int noOfItem=Integer.parseInt(IO.readln("Enter number of Items :"));
			IO.println("Please Enter the Item Name and Price");
			double prices[]=new double[noOfItem];
			for(int i=0;i<prices.length;i++) {
				IO.print(i+1+") Item Name: ");
				String itemName=IO.readln();
				IO.print("Item Price: ");
				double itemprice=Integer.parseInt(IO.readln());
				prices[i]=itemprice;
			}
			customer=new PrimeCustomer(name);
			generateBill(customer, prices);
			
		}
		case 3 ->{
			
			String name= IO.readln("Please Enter your Name :");
			int noOfItem=Integer.parseInt(IO.readln("Enter number of Items :"));
			IO.println("Please Enter the Item Name and Price");
			double prices[]=new double[noOfItem];
			for(int i=0;i<prices.length;i++) {
				IO.print(i+1+") Item Name: ");
				String itemName=IO.readln();
				IO.print("Item Price: ");
				double itemprice=Integer.parseInt(IO.readln());
				prices[i]=itemprice;
			}
			customer=new VIPCustomer(name);
			generateBill(customer, prices);
			
		}
		}
	
	}
	   
	public static void generateBill(Customer cust, double ...prices) 
	{
		
		cust.calculateBill(prices);
		cust.printDetails();
		
	}


}
