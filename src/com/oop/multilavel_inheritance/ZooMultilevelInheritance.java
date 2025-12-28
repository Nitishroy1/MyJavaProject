package com.oop.multilavel_inheritance;
import java.util.*;
	class Animal{
		private String name;
		
		public Animal(String name) {
			this.name=name;
			
		}
		public void setName(String name) {
			this.name=name;
			
		}
		public String getName() {
			return this.name;
		}
		@Override
		public String toString() {
			return "Animal [name=" + name + "]";
		}
		
		
	}
	
	class Mammal extends Animal{
		private boolean hasFur;

		public Mammal(String name, boolean hasFur) {
			super(name);
			this.hasFur = hasFur;
		}

		public boolean isHasFur() {
			return hasFur;
		}

		public void setHasFur(boolean hasFur) {
			this.hasFur = hasFur;
		}

		@Override
		public String toString() {
			return super.toString()+" Mammal [hasFur=" + hasFur + "]";
		}
		
		
	}
	
	class Dog extends Mammal{
		private String breed;

		public Dog(String name, boolean hasFur, String breed) {
			super(name, hasFur);
			this.breed = breed;
		}

		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}

		@Override
		public String toString() {
			return "Dog [Name="+super.toString()+ "breed=" + breed + "]";
		}
	 
	}
	
	public class ZooMultilevelInheritance {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			while(true) {
			System.out.println("Choose the type of object to create: \n 1. Animal \n 2. Mammal \n 3.Dog");
			System.out.print("Enter your choice : ");
			int choice= Integer.parseInt(sc.nextLine());
			
			if(choice<=3) {
			System.out.print("Enter Animal Name: ");
			String name= sc.nextLine();
			
			System.out.print("Does the Mammal have fur? (true/false): ");
			boolean fur=Boolean.parseBoolean(sc.nextLine());
			
			
			if(choice==1) {
			Animal animal= new Animal(name);
			System.out.println(animal);
			
			}
			else if(choice==2) {
				
				Mammal mammal= new Mammal(name, fur);
				System.out.println(mammal);
				
				
			}
			else if(choice==3) {
				System.out.print("Enter Dog Breed: ");
				String bride=sc.nextLine();
				Dog dog= new Dog(name, fur, bride);
				System.out.println(dog);
				
			}
			}
			else  
			{
				System.out.println("Invalide choice ");
				System.exit(0);
			}
			 
			}
		}
	

}
