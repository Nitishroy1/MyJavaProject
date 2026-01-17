package com.arrayList.cCass.prog;

import java.util.ArrayList;

public class CabCustomerServiceTester {
	void main() {
		CustomerService service= new CustomerService();
		 Customer c1 = new Customer(1, "John", "Ameerpet", "Madhapur", 5, "9876543210");
		 service.addCustomer(c1);
         service.printBill(c1);
         Customer c2 = new Customer(2, "Smith", "KPHB", "Hitech City", 3, "9123456789");
         service.addCustomer(c1);
         service.printBill(c2);
//         Customer c3 = new Customer(3, "John", "Ameerpet", "Secunderabad", 8, "9876543210");
//         service.addCustomer(c1);
//         service.printBill(c3);
	}

}
