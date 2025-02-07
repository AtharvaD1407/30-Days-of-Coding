import java.util.Scanner;

public class Day_03 {
    public static void main(String[] args) {

        // Task 1: Check if the number is even or odd
        System.out.println("1.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("---------------------------------");

        // Task 2: Check if the person is eligible to vote
        System.out.println("2.");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
        System.out.println("---------------------------------");

        // Task 3: Print the day of the week based on input
        System.out.println("3.");
        System.out.print("Enter a day number (1 to 7): ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day Number");
        }
        System.out.println("---------------------------------");

        // Closing scanner
        scanner.close();

        // Questions for you
        System.out.println();
        System.out.println("Questions for you");
        System.out.println();

        // Question 1: What happens if you forget the break in a switch statement?
        System.out.println(
                "1. Without 'break', the program will continue to execute the next case (fall-through), potentially causing unintended behavior.");

        // Question 2: What happens if we remove the else block in an if-else statement?
        System.out.println(
                "2. If the else block is removed and the condition is false, nothing will happen, but the program will not crash.");
    }
}
