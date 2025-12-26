package oop;

/**
 * Demonstrates polymorphism - ability of objects to take multiple forms.
 * Includes method overloading (compile-time) and method overriding (runtime).
 */
class Calculator {
    // Method Overloading - same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Runtime Polymorphism - method overriding
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
    
    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    double area() {
        return length * width;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Method Overloading Example
        System.out.println("=== Method Overloading ===");
        Calculator calc = new Calculator();
        System.out.println("add(5, 3): " + calc.add(5, 3));
        System.out.println("add(5.5, 3.2): " + calc.add(5.5, 3.2));
        System.out.println("add(1, 2, 3): " + calc.add(1, 2, 3));
        
        // Method Overriding Example (Runtime Polymorphism)
        System.out.println("\n=== Method Overriding ===");
        Shape shape;
        
        shape = new Circle(5.0);
        shape.draw();
        System.out.println("Area: " + shape.area());
        
        shape = new Rectangle(4.0, 6.0);
        shape.draw();
        System.out.println("Area: " + shape.area());
    }
}
