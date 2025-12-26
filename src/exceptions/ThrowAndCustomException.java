package exceptions;

/**
 * Demonstrates throwing exceptions and creating custom exceptions.
 */
// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class AgeValidator {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}

public class ThrowAndCustomException {
    public static void main(String[] args) {
        // Using throw keyword
        System.out.println("=== Throwing Exceptions ===");
        try {
            checkPositive(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        
        // Custom exception
        System.out.println("\n=== Custom Exception ===");
        try {
            AgeValidator.validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
        
        try {
            AgeValidator.validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
    
    static void checkPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        System.out.println("Number is positive: " + number);
    }
}
