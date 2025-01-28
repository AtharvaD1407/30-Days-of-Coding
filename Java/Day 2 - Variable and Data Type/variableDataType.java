// This program demonstrates:
// 1. Primitive Data Types.
// 2. Non-Primitive Data Types (Strings and Arrays).
// 3. Type Casting (Implicit and Explicit).
// ----------------------------------------

public class variableDataType {
    public static void main(String[] args) {

        // --- Primitive Data Types ---
        System.out.println("** Primitive Data Types **");

        // Integer types
        byte smallNumber = 127; // Range: -128 to 127
        short mediumNumber = 32767; // Range: -32,768 to 32,767
        int number = 2147483647; // Range: -2^31 to 2^31-1
        long largeNumber = 9223372036854775807L; // Range: -2^63 to 2^63-1 (note the 'L')

        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Int: " + number);
        System.out.println("Long: " + largeNumber);
        System.out.println();

        // Floating-point types
        float decimalNumber = 3.14f; // Single precision (note the 'f')
        double largeDecimal = 3.141592653589793; // Double precision

        System.out.println("Float: " + decimalNumber);
        System.out.println("Double: " + largeDecimal);
        System.out.println();

        // Character type
        char letter = 'A'; // Single character
        System.out.println("Char: " + letter);
        System.out.println();

        // Boolean type
        boolean isJavaFun = true; // Can only be true or false
        System.out.println("Boolean: " + isJavaFun);
        System.out.println();

        // --- Non-Primitive Data Types ---
        System.out.println("** Non-Primitive Data Types **");

        // String (a sequence of characters)
        String name = "John Doe";
        System.out.println("String: " + name);

        // Array (a collection of similar data types)
        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // --- Type Casting ---
        System.out.println("** Type Casting **");

        // Implicit Casting (Widening Conversion)
        // Smaller data type -> larger data type
        int small = 10;
        double widened = small; // int to double
        System.out.println("Implicit Casting (int to double): " + widened);

        // Explicit Casting (Narrowing Conversion)
        // Larger data type -> smaller data type
        double large = 9.99;
        int narrowed = (int) large; // double to int
        System.out.println("Explicit Casting (double to int): " + narrowed);

        // Examples of Explicit Casting
        long longNumber = 1000L;
        int intNumber = (int) longNumber; // long to int
        System.out.println("Explicit Casting (long to int): " + intNumber);

        float floatNumber = 5.67f;
        short shortNumber = (short) floatNumber; // float to short
        System.out.println("Explicit Casting (float to short): " + shortNumber);

        // Casting char to int (ASCII value)
        char character = 'A';
        int asciiValue = (int) character; // char to int
        System.out.println("Casting char to int (ASCII of 'A'): " + asciiValue);

        // Casting int to char
        int ascii = 66;
        char convertedChar = (char) ascii; // int to char
        System.out.println("Casting int to char (66 to 'B'): " + convertedChar);

        // Byte Overflow Example
        byte b = (byte) 128; // Value wraps around because 128 is out of range for byte
        System.out.println("Byte Overflow (128 cast to byte): " + b);

        // --- Special Cases ---
        System.out.println("\n** Special Cases **");

        // Dividing integers
        int dividend = 10;
        int divisor = 3;
        int result = dividend / divisor; // Integer division
        System.out.println("Integer Division (10 / 3): " + result);

        // Dividing floats
        float floatResult = (float) dividend / divisor; // Casting to get precise result
        System.out.println("Floating-point Division (10 / 3): " + floatResult);

        // Adding an int and a float
        float sum = dividend + decimalNumber; // Implicit casting of int to float
        System.out.println("Adding int and float (10 + 3.14): " + sum);

        // --- Combining Strings ---
        System.out.println("\n** Combining Strings **");
        String greeting = "Hello, ";
        String fullName = greeting + name; // Concatenating strings
        System.out.println("Greeting: " + fullName);

        // --- Summary of Type Conversions ---
        System.out.println("\n** Summary of Type Conversions **");

        // Implicit Casting (Widening)
        System.out.println("Implicit: byte -> short -> int -> long -> float -> double");

        // Explicit Casting (Narrowing)
        System.out.println("Explicit: double -> float -> long -> int -> short -> byte");

    }
}
