package com.interface1.products;

public class ProductStore {

	public static void main(String[] args) {
		IO.println("Select Product Type:");
		IO.println("1. Digital Product");
		IO.println("2. Physical Product");
		int choice=Integer.parseInt(IO.readln("Enter product Type: "));
		Product p=null;
		switch(choice) {
		case 1->{
			IO.print("Enter Digital Product Name :");
			String name=IO.readln();
			IO.print("Enter Product Price :");
			double price=Double.parseDouble(IO.readln());
			IO.print("Enter Product Category :");
			String category=IO.readln();
			IO.print("Enter Product License Key :");
			String licenseKey=IO.readln();
			IO.print("Enter the discount % on final bill: ");
			double discount=Double.parseDouble(IO.readln());
			p=new DigitalProduct(name, price, category, licenseKey);
			IO.println(p);
			p.applyDiscount(discount);
			IO.println("Tax RS : "+p.calaulateTax());
		}
		case 2->{
			IO.print("Enter Digital Product Name :");
			String name=IO.readln();
			IO.print("Enter Product Price :");
			double price=Double.parseDouble(IO.readln());
			IO.print("Enter Product Category :");
			String category=IO.readln();
			IO.print("Enter Product weight :");
			double weigth=Double.parseDouble(IO.readln());
			IO.print("Enter the discount % on final bill: ");
			double discount=Double.parseDouble(IO.readln());
			p=new PhysicalProduct(name, price, category, weigth);
			IO.println(p);
			p.applyDiscount(discount);
			IO.println("Tax RS : "+p.calaulateTax());
			
			PhysicalProduct p1=(PhysicalProduct)p;
			IO.println("Shipping Cost RS :"+ p1.calculateShippingCost());
		}
		}

	}

}
