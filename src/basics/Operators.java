package basics;

/**
 * Demonstrates various operators in Java.
 * Including arithmetic, relational, logical, and assignment operators.
 */
public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        // Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        // Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        
        // Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));  // AND
        System.out.println("x || y: " + (x || y));  // OR
        System.out.println("!x: " + (!x));           // NOT
        
        // Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int c = 10;
        System.out.println("c = " + c);
        c += 5;  // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4: " + c);
    }
}
