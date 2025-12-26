# Core Java Learning

A structured repository covering Core Java fundamentals with clear concepts and minimal code examples. Perfect for beginners and those looking to refresh their Java knowledge.

## 📚 Table of Contents

1. [Basics](#basics)
2. [Control Flow](#control-flow)
3. [Object-Oriented Programming](#object-oriented-programming)
4. [Exception Handling](#exception-handling)
5. [Collections Framework](#collections-framework)
6. [File I/O](#file-io)
7. [Multithreading](#multithreading)
8. [How to Run](#how-to-run)

## 📖 Topics Covered

### Basics
Located in `src/basics/`
- **HelloWorld.java** - The classic first program
- **DataTypes.java** - All 8 primitive data types (byte, short, int, long, float, double, char, boolean)
- **Variables.java** - Local, instance, static, and final variables
- **Operators.java** - Arithmetic, relational, logical, and assignment operators

### Control Flow
Located in `src/controlflow/`
- **IfElseDemo.java** - If, if-else, if-else-if ladder, and nested if statements
- **SwitchDemo.java** - Switch-case statements with int and String
- **LoopsDemo.java** - For, while, do-while, enhanced for loops, break, and continue

### Object-Oriented Programming
Located in `src/oop/`
- **ClassAndObject.java** - Classes, objects, constructors, and methods
- **Encapsulation.java** - Data hiding using private variables and getter/setter methods
- **Inheritance.java** - Parent-child class relationships and method overriding
- **Polymorphism.java** - Method overloading (compile-time) and method overriding (runtime)
- **Abstraction.java** - Abstract classes, abstract methods, and interfaces

### Exception Handling
Located in `src/exceptions/`
- **ExceptionHandling.java** - Try-catch-finally blocks, multiple catch blocks
- **ThrowAndCustomException.java** - Throw keyword and creating custom exceptions

### Collections Framework
Located in `src/collections/`
- **ListDemo.java** - ArrayList and LinkedList implementations
- **SetDemo.java** - HashSet, LinkedHashSet, and TreeSet implementations
- **MapDemo.java** - HashMap, LinkedHashMap, and TreeMap implementations

### File I/O
Located in `src/fileio/`
- **FileReadWrite.java** - Reading from and writing to text files using BufferedReader and BufferedWriter
- **FileOperations.java** - File and directory operations (create, delete, check existence)

### Multithreading
Located in `src/multithreading/`
- **ThreadDemo.java** - Creating threads by extending Thread class and implementing Runnable interface
- **Synchronization.java** - Thread synchronization to prevent race conditions

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- Command line terminal or IDE (Eclipse, IntelliJ IDEA, VS Code)

### Compile and Run from Command Line

1. Navigate to the repository root directory:
```bash
cd core-java-learning
```

2. Compile a Java file:
```bash
javac src/basics/HelloWorld.java
```

3. Run the compiled class:
```bash
java -cp src basics.HelloWorld
```

### Or compile and run in one step:
```bash
cd src
javac basics/HelloWorld.java && java basics.HelloWorld
```

### Run All Examples in a Category

For example, to run all basic examples:
```bash
cd src
javac basics/*.java
java basics.HelloWorld
java basics.DataTypes
java basics.Variables
java basics.Operators
```

## 📝 Learning Path

If you're new to Java, follow this order:

1. Start with **Basics** - Understand data types, variables, and operators
2. Move to **Control Flow** - Learn decision making and loops
3. Study **OOP Concepts** - Master the four pillars of OOP
4. Learn **Exception Handling** - Handle errors gracefully
5. Explore **Collections** - Work with data structures
6. Practice **File I/O** - Read and write files
7. Understand **Multithreading** - Concurrent programming basics

## 🤝 Contributing

Feel free to contribute by:
- Adding more examples
- Improving existing code
- Fixing bugs
- Adding documentation

## 📄 License

This project is open source and available for educational purposes.

## 👨‍💻 Author

Created for learning and educational purposes.

---

Happy Learning! 🎉
