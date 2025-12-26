package exceptions;

/**
 * Demonstrates exception handling using try-catch-finally blocks.
 * Exception handling helps manage runtime errors gracefully.
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        // Basic try-catch
        System.out.println("=== Basic Try-Catch ===");
        try {
            int result = 10 / 0;  // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            System.out.println("Exception message: " + e.getMessage());
        }
        
        // Multiple catch blocks
        System.out.println("\n=== Multiple Catch Blocks ===");
        try {
            int[] arr = new int[5];
            arr[10] = 50;  // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        }
        
        // Try-catch-finally
        System.out.println("\n=== Try-Catch-Finally ===");
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null pointer error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }
        
        System.out.println("\nProgram continues after exception handling");
    }
}
