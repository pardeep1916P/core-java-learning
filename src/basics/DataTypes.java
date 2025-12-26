package basics;

/**
 * Demonstrates all primitive data types in Java.
 * Java has 8 primitive data types: byte, short, int, long, float, double, char, boolean
 */
public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127;                    // 8-bit signed (-128 to 127)
        short shortVar = 32767;                 // 16-bit signed (-32,768 to 32,767)
        int intVar = 2147483647;                // 32-bit signed
        long longVar = 9223372036854775807L;    // 64-bit signed (note the L suffix)
        
        // Floating-point types
        float floatVar = 3.14f;                 // 32-bit (note the f suffix)
        double doubleVar = 3.141592653589793;   // 64-bit
        
        // Character type
        char charVar = 'A';                     // 16-bit Unicode character
        
        // Boolean type
        boolean boolVar = true;                 // true or false
        
        // Print all values
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
    }
}
