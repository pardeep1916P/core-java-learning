package src.jvm;

class JVMTest1 {
    // Defines a class named JVMTest.
    // No access modifier means it’s accessible only inside this package.

    public static void main(String[] args) {
        // Main method: this is where the JVM starts executing the program.

        JVMTest1 obj = new JVMTest1();
        // Creates a new JVMTest object.
        // The object itself lives on the heap.
        // 'obj' is just a reference pointing to that object.

        System.out.println(obj);
        // Prints the object reference.
        // Since toString() is not overridden,
        // Java uses Object.toString().
        // Output looks like: JVMTest@1a2b3c
    }
}
