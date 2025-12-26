package oop;

/**
 * Demonstrates inheritance - a mechanism where a new class inherits properties
 * and methods from an existing class.
 */
// Parent class (superclass)
class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class (subclass) - inherits from Animal
class Dog extends Animal {
    String breed;
    
    Dog(String name, String breed) {
        super(name);  // Call parent constructor
        this.breed = breed;
    }
    
    void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
    
    // Method overriding
    @Override
    void eat() {
        System.out.println(name + " the dog is eating dog food");
    }
}

// Another child class
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    
    void meow() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }
    
    @Override
    void eat() {
        System.out.println(name + " the cat is eating cat food");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        System.out.println("=== Dog ===");
        System.out.println("Name: " + dog.name);
        System.out.println("Breed: " + dog.breed);
        dog.eat();      // Overridden method
        dog.sleep();    // Inherited method
        dog.bark();     // Dog-specific method
        
        System.out.println("\n=== Cat ===");
        Cat cat = new Cat("Whiskers");
        System.out.println("Name: " + cat.name);
        cat.eat();      // Overridden method
        cat.sleep();    // Inherited method
        cat.meow();     // Cat-specific method
    }
}
