// ==========================================
//          METHODS IN JAVA - ALL TYPES
// ==========================================
// This program demonstrates different types of methods in Java, including:
// - Methods with and without parameters
// - Methods with and without return types
// - Methods with arrays and variable arguments
// - Recursive methods
// - Method Overloading (Same method name, different parameters)
// ==========================================

public class Methods {

    // 1️⃣ No Parameters, No Return Type
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // 2️⃣ No Parameters, With Return Type
    public static String getGreeting() {
        return "Hello, this is a return-type method!";
    }

    // 3️⃣ With Parameters, No Return Type
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // 4️⃣ With Parameters, With Return Type
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 5️⃣ Method with Multiple Parameters
    public static void displayInfo(String name, int age, double height) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
    }

    // 6️⃣ Method with an Array as a Parameter
    public static void printArray(int[] numbers) {
        System.out.print("Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 7️⃣ Method Returning an Array
    public static int[] getNumbers() {
        return new int[] { 10, 20, 30, 40 };
    }

    // 8️⃣ Method with Variable Arguments (Varargs)
    public static void sumNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of given numbers: " + sum);
    }

    // 9️⃣ Method with `void` Return Type
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    // 🔟 Method Returning `boolean`
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // 1️⃣1️⃣ Recursive Method (Factorial Calculation)
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // =====================================
    // METHOD OVERLOADING
    // =====================================

    // 1️⃣2️⃣ Method Overloading - Same method name, different parameters
    public static void printMessage() {
        System.out.println("Hello, this is a simple message!");
    }

    // Overloaded version with one parameter
    public static void printMessage(String name) {
        System.out.println("Hello, " + name + "! Welcome to method overloading.");
    }

    // Overloaded version with two parameters
    public static void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    // Overloaded version with a different return type
    public static String printMessage(int age) {
        return "Your age is " + age;
    }

    // Overloaded method for sum (Different number of parameters)
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for sum (Different data type)
    public static double add(double a, double b) {
        return a + b;
    }

    // =====================================
    // MAIN METHOD
    // =====================================
    public static void main(String[] args) {
        // 1️⃣ Calling a method without parameters and return type
        greet();

        // 2️⃣ Calling a method that returns a value
        String message = getGreeting();
        System.out.println(message);

        // 3️⃣ Calling a method with parameters but no return type
        printSum(10, 20);

        // 4️⃣ Calling a method with parameters and return type
        int product = multiply(5, 6);
        System.out.println("Product: " + product);

        // 5️⃣ Calling a method with multiple parameters
        displayInfo("Alice", 25, 1.65);

        // 6️⃣ Passing an array to a method
        int[] myArray = { 1, 2, 3, 4, 5 };
        printArray(myArray);

        // 7️⃣ Receiving an array from a method
        int[] nums = getNumbers();
        printArray(nums);

        // 8️⃣ Calling a method with variable arguments
        sumNumbers(5, 10, 15);
        sumNumbers(1, 2, 3, 4, 5, 6);

        // 9️⃣ Calling a method with a void return type
        sayHello();

        // 🔟 Checking if a number is even using a method with a boolean return type
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Is 7 even? " + isEven(7));

        // 1️⃣1️⃣ Calling a recursive function
        System.out.println("Factorial of 5: " + factorial(5));

        // =====================================
        // TESTING METHOD OVERLOADING
        // =====================================

        // 1️⃣2️⃣ Calling overloaded methods
        printMessage(); // No parameter
        printMessage("John"); // One parameter
        printMessage("Emily", 30); // Two parameters
        System.out.println(printMessage(25)); // Different return type

        // Calling overloaded sum methods
        System.out.println("Sum of 10 + 20: " + add(10, 20));
        System.out.println("Sum of 10 + 20 + 30: " + add(10, 20, 30));
        System.out.println("Sum of 5.5 + 2.5: " + add(5.5, 2.5));
    }
}
