# Java Development Kit (JDK) – Overview

### 1. What is JDK?
**JDK (Java Development Kit)** is a Java software development kit that provides tools to compile, debug, document, and run Java programs.

---

### 2. Is JDK platform dependent?
**Yes,** JDK is platform dependent because it includes platform-specific tools and a platform-specific JVM.

---

### 3. What is included in JDK?
JDK includes:
- Java Runtime Environment (JRE)
- Java compiler (`javac`)
- Java launcher (`java`)
- Debugger (`jdb`)
- Documentation tool (`javadoc`)
- Archiving tool (`jar`)
- Other development utilities

---

### 4. Can we compile a Java program without JDK?
**No,** compilation requires the Java compiler (`javac`), which is part of the **JDK**.  Without JDK, Java source code (`.java`) cannot be compiled into bytecode (`.class`).

---

### 5. Can we run Java without JDK?
**Yes,** Java programs can run using **JRE only**, provided the bytecode (`.class` file) is already available.

---

### 6. Can JVM exist without JDK?
**Yes,** JVM is part of **JRE** and does not require JDK to execute bytecode.

---

### 7. Difference between JDK and JRE?

| Feature | JDK | JRE |
|------|----|----|
| Purpose | Development + Execution | Execution only |
| Contains compiler (`javac`) | Yes | No |
| Contains JVM | Yes | Yes |
| Used by developers | Yes | No |
| Used in production | Usually No | Yes |

---

### 8. Why is JDK required for compilation?
Because the Java compiler (`javac`) is included in the **JDK**, not in the JRE.

---

### 9. Is JDK required on production servers?
**Usually no,** production servers typically require only **JRE** to run pre-compiled Java applications.JDK is needed only if compilation or debugging is required on the server.
