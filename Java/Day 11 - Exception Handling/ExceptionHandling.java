// This program covers try-catch-finally, custom exceptions, and multiple exceptions

public class ExceptionHandling {

    // Custom Exception class to demonstrate how to create your own exceptions
    static class AgeNotValidException extends Exception {
        // Constructor to pass custom error message
        public AgeNotValidException(String message) {
            super(message); // Pass message to superclass (Exception)
        }
    }

    // Main method where the execution begins
    public static void main(String[] args) {

        // Part 1: try-catch-finally block
        System.out.println("Part 1: Demonstrating try-catch-finally");

        try {
            // Code that might throw an exception
            int result = 10 / 0;  // This will throw ArithmeticException (divide by zero)
        } catch (ArithmeticException e) {
            // This block will catch the exception
            System.out.println("Exception caught: " + e); // Display exception message
        } finally {
            // Finally block is always executed, even if there is an exception or not
            System.out.println("This block will always execute, no matter what!");
        }

        System.out.println("-------------------------------------------------");

        // Part 2: Custom Exception
        System.out.println("Part 2: Demonstrating Custom Exception");

        try {
            // Code that may throw our custom exception
            int age = 17;
            checkAge(age);  // If age is less than 18, it throws a custom exception
        } catch (AgeNotValidException e) {
            // Catch the custom exception
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        System.out.println("-------------------------------------------------");

        // Part 3: Handling Multiple Exceptions
        System.out.println("Part 3: Demonstrating Multiple Exceptions");

        try {
            String text = null;
            // The following line will throw a NullPointerException
            System.out.println(text.length());  // Null pointer exception
            
            // The next line will throw an ArrayIndexOutOfBoundsException
            int[] arr = new int[2];
            System.out.println(arr[5]);  // Array index out of bounds
        } catch (NullPointerException e) {
            // Catch NullPointerException
            System.out.println("Caught Exception: Null Pointer Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch ArrayIndexOutOfBoundsException
            System.out.println("Caught Exception: Array Index Out of Bounds");
        } catch (Exception e) {
            // Catch any other general exception
            System.out.println("Caught Generic Exception: " + e);
        } finally {
            // This block will always be executed
            System.out.println("Finally block in multiple exceptions example.");
        }

        System.out.println("End of Program");
    }

    // Method to demonstrate custom exception
    public static void checkAge(int age) throws AgeNotValidException {
        // If age is less than 18, throw a custom exception
        if (age < 18) {
            throw new AgeNotValidException("Age is not valid. Must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
