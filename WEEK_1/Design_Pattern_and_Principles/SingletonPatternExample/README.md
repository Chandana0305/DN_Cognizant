# Singleton Pattern Example (Java)
This project demonstrates the implementation of the **Singleton Design Pattern** in Java.
The Singleton Pattern ensures that a class has **only one instance** throughout the application and provides a global access point to that instance.

This example implements a `Logger` class that follows the Singleton pattern.

## Problem Statement
Implement a Logger class that:

- Has only one object throughout the application.
- Uses a private constructor.
- Provides a static method to access the object.
- Demonstrates that multiple calls return the same object.


## Project Structure
SingletonPatternExample/
│── Logger.java
│── SingletonTest.java
│── README.md

## Logger.java
- Private constructor
- Private static instance
- Public static `getInstance()` method
- `log()` method for logging messages


## SingletonTest.java
Creates multiple Logger references using `getInstance()` and verifies that only one object is created.


## Expected Output
Logger Instance created
Log: First Message
Log: Second Message
Same Instance: true
```

> The constructor is called only once, proving that only one object exists.

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| getInstance() | O(1) |
| log() | O(1) |

---

## Design Pattern Used

- Singleton Design Pattern

