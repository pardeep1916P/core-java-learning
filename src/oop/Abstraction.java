package oop;

/**
 * Demonstrates abstraction - hiding implementation details and showing only functionality.
 * Uses abstract classes and abstract methods.
 */
abstract class Vehicle {
    String name;
    
    Vehicle(String name) {
        this.name = name;
    }
    
    // Abstract method (no implementation)
    abstract void start();
    
    // Concrete method
    void stop() {
        System.out.println(name + " stopped");
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
    
    @Override
    void start() {
        System.out.println(name + " bike started with kick");
    }
}

class Truck extends Vehicle {
    Truck(String name) {
        super(name);
    }
    
    @Override
    void start() {
        System.out.println(name + " truck started with key ignition");
    }
}

// Interface example (100% abstraction)
interface Drawable {
    void draw();  // public abstract by default
}

class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Abstract class example
        System.out.println("=== Abstract Class ===");
        Vehicle bike = new Bike("Hero Honda");
        bike.start();
        bike.stop();
        
        Vehicle truck = new Truck("Tata");
        truck.start();
        truck.stop();
        
        // Interface example
        System.out.println("\n=== Interface ===");
        Drawable triangle = new Triangle();
        triangle.draw();
        
        Drawable square = new Square();
        square.draw();
    }
}
