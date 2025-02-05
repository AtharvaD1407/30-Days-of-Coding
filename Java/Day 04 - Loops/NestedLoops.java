public class NestedLoops {
    public static void main(String[] args) {

        // ******************************
        // 1. Nested For Loop
        // ******************************
        // A nested loop means a loop inside another loop.
        // The outer loop runs first, then the inner loop runs completely for each
        // iteration of the outer loop.
        System.out.println("Nested For Loop:");
        for (int i = 1; i <= 3; i++) { // Outer loop runs 3 times
            for (int j = 1; j <= 3; j++) { // Inner loop runs 3 times for each outer loop iteration
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println(); // Move to next line after inner loop completes
        }
        /*
         * Output:
         * (1,1) (1,2) (1,3)
         * (2,1) (2,2) (2,3)
         * (3,1) (3,2) (3,3)
         */

        System.out.println(); // Move to next line

        // ******************************
        // 2. Nested While Loop
        // ******************************
        // The same logic as nested for loops, but using while loops.
        System.out.println("Nested While Loop:");
        int i = 1;
        while (i <= 3) { // Outer loop
            int j = 1;
            while (j <= 3) { // Inner loop
                System.out.print("(" + i + "," + j + ") ");
                j++; // Increment inner loop variable
            }
            System.out.println(); // Move to the next line
            i++; // Increment outer loop variable
        }
        /*
         * Output:
         * (1,1) (1,2) (1,3)
         * (2,1) (2,2) (2,3)
         * (3,1) (3,2) (3,3)
         */

        System.out.println(); // Move to next line

        // ******************************
        // 3. Nested Do-While Loop
        // ******************************
        // The do-while loop runs at least once, even if the condition is false.
        System.out.println("Nested Do-While Loop:");
        i = 1;
        do {
            int j = 1;
            do {
                System.out.print("(" + i + "," + j + ") ");
                j++; // Increment inner loop variable
            } while (j <= 3); // Inner loop condition
            System.out.println(); // Move to the next line
            i++; // Increment outer loop variable
        } while (i <= 3); // Outer loop condition
        /*
         * Output:
         * (1,1) (1,2) (1,3)
         * (2,1) (2,2) (2,3)
         * (3,1) (3,2) (3,3)
         */

        System.out.println(); // Move to next line

        // ******************************
        // 4. Nested Loops for Pattern Printing
        // ******************************
        // Example: Printing a simple right-angled triangle pattern.
        System.out.println("Right-Angled Triangle Pattern:");
        for (int row = 1; row <= 5; row++) { // Outer loop controls the number of rows
            for (int col = 1; col <= row; col++) { // Inner loop controls the number of stars in each row
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to next line after inner loop completes
        }
        /*
         * Output:
         * 
         * *
         * * *
         * * * *
         * * * * *
         */

        System.out.println(); // Move to next line

        // ******************************
        // 5. Multiplication Table Using Nested Loops
        // ******************************
        System.out.println("Multiplication Table (1 to 5):");
        for (int num = 1; num <= 5; num++) { // Outer loop for each number (1 to 5)
            for (int multiplier = 1; multiplier <= 10; multiplier++) { // Inner loop for multipliers (1 to 10)
                System.out.print(num * multiplier + "\t"); // Print multiplication result
            }
            System.out.println(); // Move to the next line after inner loop completes
        }
        /*
         * Output:
         * 1 2 3 4 5 6 7 8 9 10
         * 2 4 6 8 10 12 14 16 18 20
         * 3 6 9 12 15 18 21 24 27 30
         * 4 8 12 16 20 24 28 32 36 40
         * 5 10 15 20 25 30 35 40 45 50
         */

        System.out.println(); // Move to next line

        // ******************************
        // 6. Nested Loops with Break Statement
        // ******************************
        // Using break inside a nested loop
        System.out.println("Nested Loops with Break:");
        for (int x = 1; x <= 3; x++) { // Outer loop
            for (int y = 1; y <= 3; y++) { // Inner loop
                if (y == 2) { // If y reaches 2, break the inner loop
                    break;
                }
                System.out.print("(" + x + "," + y + ") ");
            }
            System.out.println(); // Move to next line
        }
        /*
         * Output:
         * (1,1)
         * (2,1)
         * (3,1)
         */

        System.out.println(); // Move to next line

        // ******************************
        // 7. Nested Loops with Continue Statement
        // ******************************
        // Using continue inside a nested loop
        System.out.println("Nested Loops with Continue:");
        for (int a = 1; a <= 3; a++) { // Outer loop
            for (int b = 1; b <= 3; b++) { // Inner loop
                if (b == 2) { // If b is 2, skip this iteration
                    continue;
                }
                System.out.print("(" + a + "," + b + ") ");
            }
            System.out.println(); // Move to next line
        }
        /*
         * Output:
         * (1,1) (1,3)
         * (2,1) (2,3)
         * (3,1) (3,3)
         */

    }
}
