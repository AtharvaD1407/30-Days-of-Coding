# Java Exception Handling Practice Questions

These practice questions are based on the concepts demonstrated in the `ExceptionHandlingExample.java` file, including **Try-Catch-Finally**, **Custom Exceptions**, and **Handling Multiple Exceptions**.

---

## 1. Basic Try-Catch-Finally
- Write a program that tries to divide two numbers. Implement a `try-catch` block to handle any `ArithmeticException` (e.g., dividing by zero). Ensure that the program prints a message indicating that the `finally` block has executed, regardless of whether an exception occurred.

---

## 2. Custom Exception - Invalid Age
- Create a custom exception called `InvalidAgeException`. Write a program that accepts a user's age as input and throws the `InvalidAgeException` if the age is less than 18. The program should then catch and handle the custom exception and print a relevant message.

---

## 3. Handling Multiple Exceptions in a Single `try-catch` Block
- Modify the provided example to handle two different types of exceptions (`ArithmeticException` and `NumberFormatException`) in a single `try-catch` block using multi-catch syntax. For example, the program should handle an invalid input that results in `NumberFormatException` and a divide-by-zero error that results in `ArithmeticException`.

---

## 4. Demonstrating the `finally` Block
- Write a program that demonstrates the use of the `finally` block. The program should divide two numbers and ensure that a message is printed in the `finally` block, regardless of whether an exception occurs (e.g., `ArithmeticException`).

---

## 5. Creating and Using a Custom Exception
- Create a custom exception called `InsufficientFundsException`. Simulate a bank withdrawal operation where the program throws this exception if the user tries to withdraw more money than the available balance. The program should catch this exception and display a helpful message.

---

## 6. Handling Multiple Exceptions with Multiple `catch` Blocks
- Modify the provided program to handle multiple exceptions in separate `catch` blocks. For example, catch a `NullPointerException` and an `ArrayIndexOutOfBoundsException` separately and print out a custom message for each.

---

## 7. Exception Chaining
- In the provided code, add exception chaining. Specifically, if an `ArithmeticException` occurs, catch it and re-throw a new `RuntimeException` with the original exception as the cause. Print both the new exception and the original exception in the catch block.
