package oop;

/**
 * Demonstrates basic class and object concepts in Java.
 * A class is a blueprint, and an object is an instance of a class.
 */
class Car {
    // Instance variables (properties)
    String brand;
    String model;
    int year;
    
    // Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Method
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    void startEngine() {
        System.out.println(brand + " " + model + " engine started!");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // Creating objects (instances) of Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2023);
        
        // Accessing object methods
        System.out.println("=== Car 1 ===");
        car1.displayInfo();
        car1.startEngine();
        
        System.out.println("\n=== Car 2 ===");
        car2.displayInfo();
        car2.startEngine();
    }
}
