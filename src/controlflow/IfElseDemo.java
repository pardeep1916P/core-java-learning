package controlflow;

/**
 * Demonstrates if-else conditional statements.
 * Used for decision making based on conditions.
 */
public class IfElseDemo {
    public static void main(String[] args) {
        int number = 15;
        
        // Simple if statement
        if (number > 0) {
            System.out.println(number + " is positive");
        }
        
        // if-else statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        
        // if-else-if ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // Nested if
        int num = 10;
        if (num != 0) {
            if (num > 0) {
                System.out.println(num + " is positive");
            } else {
                System.out.println(num + " is negative");
            }
        } else {
            System.out.println("Number is zero");
        }
    }
}
