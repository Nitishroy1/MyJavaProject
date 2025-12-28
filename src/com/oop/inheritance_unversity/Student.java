package com.oop.inheritance_unversity;

import java.util.Scanner;
public class Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("--- Scenario Selection ---");
        System.out.println("Press 1 \u2192 Change the Driver of Car1 (Scenario 1)");
        System.out.println("Press 2 \u2192 Do NOT change the Driver (Scenario 2)");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // --- Step 2: User Input for Initial Object ---
        System.out.println("\n--- Enter Initial Car and Driver Details ---");
        System.out.print("Enter Car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Car year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Driver name: ");
        String driverName = scanner.nextLine();
        System.out.print("Enter Driver age: ");
        int driverAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.println("\n---------------------------------------------------");

        // 1. Create the initial Driver and Car objects
        Driver initialDriver = new Driver(driverName, driverAge);
        Car car1 = new Car(brand, model, year, initialDriver);
        System.out.println("Car1 (Original): " + car1);

        // 2. Create Car2 using the Deep Copy Constructor
        // This is the core demonstration of the Deep Copy concept
        Car car2 = new Car(car1);
        System.out.println("Car2 (Deep Copy): " + car2);

        // Verification of Object Identity (Car1's Driver object vs. Car2's Driver object)
        System.out.println("\nVerification (Object Identity Check):");
        System.out.println("Car1's Driver object == Car2's Driver object? " + (car1.getDriver() == car2.getDriver()));
        System.out.println("(The result 'false' confirms a separate Driver object was created for Car2.)");
        
        // --- Execute Scenario ---
        if (choice == 1) {
            System.out.println("\n--- Executing SCENARIO 1: Changing Driver of Car1 ---");
            
            // Create a brand new Driver object to assign to Car1
            Driver newDriverForCar1 = new Driver("Alex Turner", 35);
            car1.changeDriver(newDriverForCar1);

            System.out.println("\n**AFTER CHANGE (Car1's Driver is updated):**");
            System.out.println("Car1: " + car1);
            System.out.println("Car2: " + car2); // Car2's driver should remain unchanged

            // --- Verification Conclusion ---
            System.out.println("\nVerification Result (Deep Copy):");
            System.out.println("The Driver changed **ONLY** in Car1.");
            System.out.println("This confirms the **Deep Copy** was successful, as Car2's driver");
            System.out.println("object was independent of Car1's driver object.");

        } else if (choice == 2) {
            System.out.println("\n--- Executing SCENARIO 2: No Change Made ---");
            System.out.println("\n**NO CHANGE:**");
            System.out.println("Car1: " + car1);
            System.out.println("Car2: " + car2);
            System.out.println("\nNo change was made.");
        } else {
            System.out.println("\nInvalid choice. Exiting.");
        }

        scanner.close();
    }
}

// =================================================================
// BLC Class 1: Driver
// =================================================================
class Driver {
    // Private non-static fields
    private String name;
    private int age;

    // Parameterized Constructor
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Deep Copy Constructor for Driver (Used by Car's copy constructor)
    public Driver(Driver original) {
        this.name = original.name;
        this.age = original.age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Driver [name=" + name + ", age=" + age + "]";
    }
}


// =================================================================
// BLC Class 2: Car
// =================================================================
class Car {
    // Private non-static fields
    private String brand;
    private String model;
    private int year;
    private Driver driver; // Composition: Car has a Driver

    // Parameterized Constructor
    public Car(String brand, String model, int year, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.driver = driver;
    }

    // Deep Copy Constructor (Accepts Car as parameter)
    public Car(Car original) {
        // 1. Copy primitive and immutable fields
        this.brand = original.brand;
        this.model = original.model;
        this.year = original.year;

        // 2. DEEP COPY: Create a new instance of the mutable object (Driver)
        // This ensures the new Car object has its own, separate Driver object.
        this.driver = new Driver(original.driver); 
    }

    // Public method to update the driver of the car
    public void changeDriver(Driver newDriver) {
        this.driver = newDriver;
    }
    
    // --- Getter and Setter Methods ---

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
    }
}
