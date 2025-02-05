public class Conditionals {
    public static void main(String[] args) {
        int num = 1; // Change this value to test different cases

        // 1. Simple if statement
        if (num > 0) {
            System.out.println("The number is positive.");
        }

        num = -5;

        // 2. if-else statement
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        num = 0;

        // 3. if-else if-else statement
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        num = 10;

        // 4. Nested if statement
        if (num != 0) {
            if (num > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }
        } else {
            System.out.println("The number is zero.");
        }

        num = -3;

        // 5. Switch statement (using Integer.signum() for -1, 0, 1 cases)
        switch (Integer.signum(num)) {
            case 1:
                System.out.println("The number is positive.");
                break;
            case -1:
                System.out.println("The number is negative.");
                break;
            case 0:
                System.out.println("The number is zero.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
