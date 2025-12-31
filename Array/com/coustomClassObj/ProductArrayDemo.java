package com.coustomClassObj;

public class ProductArrayDemo {
   void main() {
	   Product[] prod=new Product[2];
	   for(int i=0;i<prod.length;i++) {
			IO.println("\nEnter Product detale: "+(i+1));
			
			int id=Integer.parseInt(IO.readln("Enter product Id: "));
			String name=IO.readln("Enter product Name: ");
			double price=Double.parseDouble(IO.readln("Enter product price: "));
			prod[i]=new Product(id, name, price);
		}
	    int searchid=Integer.parseInt(IO.readln("Enter Product ID to search:"));
		for(Product prod1: prod) {
			if(prod1.getId()==searchid) {
				IO.println(prod1);
				System.exit(0);
			}
			else {
				IO.println("Product with ID "+searchid+" not found.");
			}
		}
	}
   }

