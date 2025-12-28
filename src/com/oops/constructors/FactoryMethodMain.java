package com.oops.constructors;

public class FactoryMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryMethod f1=FactoryMethod.accept(101,"Nitish");
		System.out.println(f1);
		FactoryMethod f2=FactoryMethod.accept(102,"Shyam");
		System.out.println(f2);
		f2=f1;
		System.out.println(f1);
		f1.setId(103);
		f1.setName("ram");
		System.out.println(f1);
		System.out.println(f2);
		
		

	}

}
