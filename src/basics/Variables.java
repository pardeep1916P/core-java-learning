package basics;

/**
 * Demonstrates different types of variables in Java.
 * - Local variables: Declared inside methods
 * - Instance variables: Declared in class but outside methods
 * - Static variables: Class-level variables shared by all instances
 */
public class Variables {
    // Instance variable (non-static)
    int instanceVar = 10;
    
    // Static variable (class variable)
    static int staticVar = 20;
    
    // Final variable (constant)
    static final double PI = 3.14159;
    
    public void demonstrateVariables() {
        // Local variable
        int localVar = 30;
        
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Constant (final): " + PI);
    }
    
    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.demonstrateVariables();
        
        // Static variables can be accessed without creating an object
        System.out.println("Accessing static variable directly: " + Variables.staticVar);
    }
}
