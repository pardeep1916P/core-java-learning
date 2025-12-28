# Java Runtime Environment (JRE) – Overview

### 1. What is JRE?
**JRE (Java Runtime Environment)** is a runtime environment that provides the **JVM** and core libraries required to run Java applications.

---

### 2. Does JRE include JVM?
**Yes,** **JVM is a part of JRE** and is responsible for executing Java bytecode.

---

### 3. Can we compile Java code using JRE?
**No,** **JRE does not include the Java compiler (`javac`)**. Compilation requires JDK.

---

### 4. Can a system run Java programs with only JRE installed?
**Yes,** if the compiled bytecode (`.class` files) is already available, Java programs can run using JRE only.

---

### 5. Is JRE platform dependent?
**Yes,** **JRE is platform dependent** because it includes a platform-specific JVM.

---

### 6. What happens if JRE is missing?
Java applications **cannot be executed** because there is no JVM to run the bytecode.

---

### 7. Does JRE manage memory?
Memory management is handled by the **JVM**, which is part of JRE, using mechanisms like garbage collection.

---

### 8. Why do production servers usually have JRE?
Because production servers typically **run Java applications**, they only need JRE and not the development tools provided by JDK.
