# Java Exception Handling Example

This Java program demonstrates fundamental concepts of exception handling for beginners. The program covers the following key aspects:

1. **Try-Catch-Finally Block**
2. **Custom Exceptions**
3. **Multiple Exception Handling**

The code is structured to help new learners understand how exception handling works in Java and how to manage errors effectively in your code.

---

## Features

- **Try-Catch-Finally Block**: This program demonstrates how to use the `try`, `catch`, and `finally` blocks for exception handling. It shows how exceptions are caught and how the `finally` block is always executed, regardless of whether an exception occurs or not.
  
- **Custom Exceptions**: A custom exception, `AgeNotValidException`, is created to handle specific business logic (e.g., age validation). This helps illustrate how developers can create their own exceptions to handle specific conditions.

- **Multiple Exception Handling**: The program shows how to handle multiple types of exceptions with separate `catch` blocks, allowing different error conditions to be processed differently. It catches exceptions like `NullPointerException` and `ArrayIndexOutOfBoundsException` and handles them individually.

- **Clear Comments**: The code is extensively commented to provide clear explanations of each block and section, making it easy to understand for beginners.

---

## Code Explanation

1. **Try-Catch-Finally Block**:
   - Demonstrates the use of the `try` block to execute potentially problematic code, the `catch` block to handle exceptions, and the `finally` block to ensure code execution that should always happen (like resource cleanup).
   
2. **Custom Exceptions**:
   - Introduces the concept of creating your own exceptions by extending the `Exception` class. A custom exception (`AgeNotValidException`) is thrown if a user-provided age is invalid (less than 18).
   
3. **Multiple Exception Handling**:
   - Shows how to handle different exceptions in a single try-catch block. The program catches multiple exceptions like `NullPointerException` and `ArrayIndexOutOfBoundsException` and prints corresponding messages.

---

## How to Run

1. Clone or download this repository to your local machine.
2. Open the Java file in any Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor.
3. Compile and run the `ExceptionHandling.java` file.
4. Observe how different exceptions are handled and the output displayed in the console.

---

## Output

The program will produce output similar to the following:

