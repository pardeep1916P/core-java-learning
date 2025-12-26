package controlflow;

/**
 * Demonstrates different types of loops in Java.
 * Includes for, while, do-while loops and enhanced for loop.
 */
public class LoopsDemo {
    public static void main(String[] args) {
        // For loop
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // While loop
        System.out.println("\n=== While Loop ===");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count: " + j);
            j++;
        }
        
        // Do-While loop
        System.out.println("\n=== Do-While Loop ===");
        int k = 1;
        do {
            System.out.println("Count: " + k);
            k++;
        } while (k <= 5);
        
        // Enhanced for loop (for-each)
        System.out.println("\n=== Enhanced For Loop ===");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        // Break statement
        System.out.println("\n=== Break Statement ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking at " + i);
                break;
            }
            System.out.println(i);
        }
        
        // Continue statement
        System.out.println("\n=== Continue Statement ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
