package com.oop.multilavel_inheritance;
import java.util.*;
	class Animal1{
		public void eat() {
			System.out.println("Animal is eating");
			
		}
	}
	
	class Mammal1 extends Animal1{
		public void walk() {
			System.out.println("Mammal is walking");
			
		}
	}
	class Dog1 extends Mammal1{
		public void bark() {
			
			System.out.println("Dog is barking");
			
		}
	}
public class Multi_level {
	public static void main(String[] args) {
//		Dog dog= new Dog();
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose an action: ");
		System.out.println("1.Animal eats\n 2. Mammal walks \n 3. Dog barks");
		System.out.print("Enter your choice(1-3): ");
		int choice= Integer.parseInt(sc.nextLine());
		if(choice==1) {
			Animal1 animal=new Animal1();
			animal.eat();
		}
		else if(choice==2) {
			Mammal1 mammal=new Mammal1();
			mammal.walk();
		}
		else if(choice==3) {
			Dog1 dog=new Dog1();
			dog.bark();
		}
		
		sc.close();
		
		
	}

}

