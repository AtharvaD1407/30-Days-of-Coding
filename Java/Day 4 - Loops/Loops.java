public class Loops {
    public static void main(String[] args) {

        // ******************************
        // 1. For Loop
        // ******************************
        // The for loop runs for a fixed number of times.
        // It consists of three parts:
        // - Initialization: int i = 0; (Start from 0)
        // - Condition: i < 5; (Run as long as i is less than 5)
        // - Update: i++ (Increase i by 1 in each iteration)
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        // Output: 0 1 2 3 4

        System.out.println(); // Move to the next line

        // ******************************
        // 2. While Loop
        // ******************************
        // The while loop runs as long as the condition is true.
        // It is useful when we don’t know how many times the loop will run.
        int i = 0;
        while (i < 5) { // Check condition before running the loop
            System.out.print(i + " "); // Print the value of i
            i++; // Increment i
        }
        // Output: 0 1 2 3 4

        System.out.println(); // Move to the next line

        // ******************************
        // 3. Do-While Loop
        // ******************************
        // The do-while loop is similar to while,
        // but it ensures that the loop runs at least once.
        i = 0;
        do {
            System.out.print(i + " "); // Print the value of i
            i++; // Increment i
        } while (i < 5); // Condition is checked after executing the loop
        // Output: 0 1 2 3 4

        System.out.println(); // Move to the next line

        // ******************************
        // 4. Enhanced For Loop (For-each loop)
        // ******************************
        // This loop is used for iterating over arrays or collections.
        // It automatically retrieves each element without using an index.
        int[] numbers = { 1, 2, 3, 4, 5 }; // An array of numbers
        for (int num : numbers) { // For each number in the array
            System.out.print(num + " "); // Print the number
        }
        // Output: 1 2 3 4 5

        System.out.println(); // Move to the next line

        // ******************************
        // Loop Control Statements
        // ******************************

        // ==========================
        // 1. Break Statement
        // ==========================
        // The break statement stops the loop immediately when the condition is met.
        // Here, when j == 2, the loop will stop.
        for (int j = 0; j < 5; j++) {
            if (j == 2) { // When j reaches 2
                break; // Exit the loop
            }
            System.out.print(j + " ");
        }
        // Output: 0 1 (Loop stops at 2)

        System.out.println(); // Move to the next line

        // ==========================
        // 2. Continue Statement
        // ==========================
        // The continue statement skips the current iteration and moves to the next.
        // Here, when k == 2, it will skip printing that number.
        for (int k = 0; k < 5; k++) {
            if (k == 2) { // When k is 2
                continue; // Skip this iteration
            }
            System.out.print(k + " ");
        }
        // Output: 0 1 3 4 (2 is skipped)
    }
}
