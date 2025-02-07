import java.util.Scanner;

public class Day_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Print Even Numbers and Skip Odd Numbers
        System.out.println("1. Printing Even Numbers (Skipping Odd Numbers)");
        System.out.print("Enter the range (1 to n): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.print(i + " ");
        }
        System.out.println("\n---------------------------------");

        // Task 2: Sum of First n Natural Numbers
        System.out.println("2. Sum of First n Natural Numbers");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = num * (num + 1) / 2; // Using formula: n(n+1)/2
        System.out.println("Sum = " + sum);
        System.out.println("---------------------------------");

        // Task 3: Factorial of a Number
        System.out.println("3. Factorial of a Number");
        System.out.print("Enter a number: ");
        int factNum = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= factNum; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
        System.out.println("---------------------------------");

        // Task 4: Fibonacci Series
        System.out.println("4. Fibonacci Series");
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        int a = 0, b = 1, nextTerm;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 3; i <= terms; i++) {
            nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
        System.out.println("\n---------------------------------");

        // Task 5: Reverse a Number
        System.out.println("5. Reverse a Number");
        System.out.print("Enter a number: ");
        int revNum = scanner.nextInt();
        int reversed = 0;

        while (revNum != 0) {
            int digit = revNum % 10;
            reversed = reversed * 10 + digit;
            revNum /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
        System.out.println("---------------------------------");

        // Task 6: Print Prime Numbers in a Given Range
        System.out.println("6. Prime Numbers in a Given Range");
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        System.out.print("Prime Numbers: ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n---------------------------------");

        // Close scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
