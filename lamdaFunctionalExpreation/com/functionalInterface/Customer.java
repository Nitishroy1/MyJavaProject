package com.functionalInterface;

import java.util.function.Predicate;

record CustomerDemo(String name, Double salary, Integer creditScore,Integer age) {
	public boolean checkLoanEligibility() {
		Predicate<CustomerDemo> p1 = customer ->
			customer.salary() > 2500 && customer.creditScore()>700 && customer.age()>21;
			return p1.test(this);
	}
}

public class Customer {
	void main() {
	String name=IO.readln("Enter customer name: ");
	Double salary= Double.parseDouble(IO.readln("Enter customer salary: "));
	Integer creditScore= Integer.parseInt(IO.readln("Enter customer CreaditScore: "));
	Integer age= Integer.parseInt(IO.readln("Enter Customer age: "));
    CustomerDemo cust=new CustomerDemo(name,salary,creditScore,age);
    if(cust.checkLoanEligibility()) {
    	IO.println(name+" Customer is eligible for loan");
    }
    else {
    	IO.println(name+ " Customer is not eligible for loan");
    }
    
	}

}
