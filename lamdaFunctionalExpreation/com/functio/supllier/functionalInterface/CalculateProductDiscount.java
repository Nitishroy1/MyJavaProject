package com.functio.supllier.functionalInterface;

import java.util.function.Function;

record Product(Integer id, String name, Double price) {
	
}

public class CalculateProductDiscount {
	void main() {
		Integer id= Integer.parseInt(IO.readln("Enter product Id: "));
		String name=IO.readln("Enter product name: ");
		Double price=Double.parseDouble(IO.readln("Enter product Price: "));
		Product product=new Product(id, name, price);
		Function<Product, Double> f1= (product1)->{
			if(product1.price()>5000) {
				Double discount= product1.price()-(product1.price()*0.1);
				return discount;
			}
			else if(product1.price()<5000) {
				Double discount= product1.price()-(product1.price()*0.05);
				return discount;
			}
			else {
				return 0.0;
			}
		};
		IO.println("Final price of the product is :"+ f1.apply(product));
		
	}

}
