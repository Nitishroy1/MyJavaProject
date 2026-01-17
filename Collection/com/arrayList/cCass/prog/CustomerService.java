package com.arrayList.cCass.prog;

import java.util.ArrayList;

public class CustomerService 
{
	private ArrayList<Customer> customers;
	public CustomerService() {
		customers=new ArrayList<Customer>();
	}
	public  void addCustomer(Customer customer) {
		customers.add(customer);
		
	}
	private boolean isFirstCustomer(Customer customer){
		for(Customer customer1: customers) {
			if(customer1.phone().equals(customer.phone()))
			{
				IO.println("pre-existing customer.");
				return false;//existing customer
				
			}	
			}
		    return true;//new customer
			
		}
	public double calculateBill(Customer customer) {
		if((isFirstCustomer(customer))) {
			return 0;
		}
		else if(customer.distance()<=4) {
			return 80;
			
		}
		else 
		{
			int newdist=customer.distance()-4;
			return 80+(newdist*6);
		}
		
		
	}
	 public void printBill(Customer customer) {
	        double bill = calculateBill(customer);
	        System.out.println(customer.custrName().toUpperCase()
	                + " Please pay your bill of Rs." + bill);
	    }
		
	}


