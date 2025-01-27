// This program demonstrates primitive and non-primitive data types in Java
// and includes examples of type casting (explicit and implicit).

public class variableDataType {
    public static void main(String[] args) {

        // --- Primitive Data Types ---
        System.out.println("** Primitive Data Types **");

        int age = 25; // Integer type
        float height = 5.9f; // Floating-point type
        char initial = 'J'; // Character type
        boolean isJavaFun = true; // Boolean type
        double weight = 72.5; // Double type
        long population = 7800000000L; // Long type
        short year = 2025; // Short type
        byte level = 10; // Byte type

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial: " + initial);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Weight: " + weight);
        System.out.println("Population: " + population);
        System.out.println("Year: " + year);
        System.out.println("Level: " + level);
        System.out.println();

        // --- Non-Primitive Data Types ---
        System.out.println("** Non-Primitive Data Types **");

        String name = "John Doe"; // String is a non-primitive data type
        int[] numbers = { 10, 20, 30, 40 }; // Array

        System.out.println("Name: " + name);
        System.out.print("Numbers Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        // --- Type Casting ---
        System.out.println("** Type Casting **");

        // Implicit Casting (Widening Conversion)
        int num = 10;
        double widened = num; // int to double
        System.out.println("Implicit Casting (int to double): " + widened);

        // Explicit Casting (Narrowing Conversion)
        double decimal = 9.99;
        int narrowed = (int) decimal; // double to int
        System.out.println("Explicit Casting (double to int): " + narrowed);
    }
}
