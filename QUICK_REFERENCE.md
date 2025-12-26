# Java Quick Reference Guide

## Quick Compilation and Execution Commands

### Single File
```bash
# Compile
javac src/basics/HelloWorld.java

# Run
java -cp src basics.HelloWorld
```

### All Files in a Package
```bash
# From repository root
cd src

# Compile all files in a package
javac basics/*.java

# Run examples
java basics.HelloWorld
java basics.DataTypes
java basics.Variables
java basics.Operators
```

## Examples by Category

### 1. Basics (src/basics/)
- `HelloWorld.java` - First Java program
- `DataTypes.java` - 8 primitive types
- `Variables.java` - Local, instance, static variables
- `Operators.java` - Arithmetic, relational, logical operators

### 2. Control Flow (src/controlflow/)
- `IfElseDemo.java` - Conditional statements
- `SwitchDemo.java` - Switch-case statements
- `LoopsDemo.java` - For, while, do-while, enhanced for loops

### 3. OOP (src/oop/)
- `ClassAndObject.java` - Basic OOP concepts
- `Encapsulation.java` - Data hiding with getters/setters
- `Inheritance.java` - Parent-child relationships
- `Polymorphism.java` - Method overloading and overriding
- `Abstraction.java` - Abstract classes and interfaces

### 4. Exception Handling (src/exceptions/)
- `ExceptionHandling.java` - Try-catch-finally
- `ThrowAndCustomException.java` - Throw and custom exceptions

### 5. Collections (src/collections/)
- `ListDemo.java` - ArrayList and LinkedList
- `SetDemo.java` - HashSet, LinkedHashSet, TreeSet
- `MapDemo.java` - HashMap, LinkedHashMap, TreeMap

### 6. File I/O (src/fileio/)
- `FileReadWrite.java` - Read/write text files
- `FileOperations.java` - File and directory operations

### 7. Multithreading (src/multithreading/)
- `ThreadDemo.java` - Creating and running threads
- `Synchronization.java` - Thread synchronization

## Common Issues and Solutions

### Issue: "javac: command not found"
**Solution**: Install JDK and add it to PATH
```bash
# Check if Java is installed
java -version
javac -version
```

### Issue: "Error: Could not find or load main class"
**Solution**: Make sure you're running from the correct directory and using the full package name
```bash
# Correct
java -cp src basics.HelloWorld

# Incorrect
java HelloWorld
```

### Issue: Class files cluttering the directory
**Solution**: The .gitignore file excludes .class files from version control. To clean them:
```bash
find . -name "*.class" -type f -delete
```

## Learning Tips

1. **Start Simple**: Begin with basics before moving to advanced topics
2. **Type the Code**: Don't just read - type and run examples yourself
3. **Experiment**: Modify the examples to see what happens
4. **Practice**: Write your own programs using the concepts learned
5. **Debug**: Use print statements to understand program flow

## Additional Resources

- Official Java Documentation: https://docs.oracle.com/en/java/
- Java Tutorials: https://docs.oracle.com/javase/tutorial/
- Java API Specification: https://docs.oracle.com/en/java/javase/17/docs/api/

## Next Steps After This Repository

1. Learn about Java 8+ features (Streams, Lambda expressions)
2. Explore frameworks (Spring, Hibernate)
3. Study design patterns
4. Build real projects
5. Practice on coding platforms (LeetCode, HackerRank)
