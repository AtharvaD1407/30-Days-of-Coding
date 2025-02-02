// OOP BASICS: Classes, Objects, Instance Variables, Methods, Constructors, Overloading, Static & Final Keywords

// 1️⃣ Defining a Class (Blueprint for Objects)
class Person {
    // Instance Variables (Each object will have its own copy)
    String name;
    int age;

    // Constructor (Special Method to Initialize Objects)
    public Person(String personName, int personAge) {
        name = personName; // Assigning values to instance variables
        age = personAge;
    }

    // Instance Method (Belongs to an object)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// 2️⃣ Demonstrating Constructor Overloading
class Car {
    String brand;
    String model;
    int year;

    // Default Constructor
    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Constructor with Two Parameters
    public Car(String carBrand, String carModel) {
        brand = carBrand;
        model = carModel;
        year = 2024; // Default year
    }

    // Constructor with All Parameters
    public Car(String carBrand, String carModel, int carYear) {
        brand = carBrand;
        model = carModel;
        year = carYear;
    }

    // Method to Display Car Information
    public void displayCar() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
}

// 3️⃣ Method Overloading (Multiple Methods with Same Name but Different
// Parameters)
class MathOperations {
    // Method to Add Two Integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded Method to Add Three Integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded Method to Add Two Double Values
    public double add(double a, double b) {
        return a + b;
    }
}

// 4️⃣ Getters and Setters to Access Private Variables
class BankAccount {
    private double balance; // Private Variable (Only Accessible through Methods)

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Getter Method to Access Balance
    public double getBalance() {
        return balance;
    }

    // Setter Method to Update Balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }
}

// 5️⃣ Static Variables and Methods (Shared Among All Objects)
class Utility {
    static int objectCount = 0; // Static Variable (Shared Across All Instances)

    // Static Method (Can be Called Without Creating an Object)
    public static void printMessage() {
        System.out.println("Welcome to Java OOP Basics!");
    }

    // Constructor Increments Object Count Every Time a New Object is Created
    public Utility() {
        objectCount++;
    }
}

// 6️⃣ Final Keyword (Used with Variables, Methods, and Classes)
class Constants {
    final double PI = 3.14159; // Final Variable (Value Cannot Be Changed)

    // Final Method (Cannot be Overridden in Subclasses)
    public final void showValue() {
        System.out.println("Value of PI: " + PI);
    }
}

// Main Class to Run the Program
public class OOP_Basics {
    public static void main(String[] args) {
        // Creating and Using a Person Object
        Person person1 = new Person("Alice", 25);
        System.out.println("Person Details:");
        person1.displayInfo();
        System.out.println();

        // Demonstrating Constructor Overloading in Car Class
        Car car1 = new Car(); // Default Constructor
        Car car2 = new Car("Toyota", "Corolla"); // Constructor with Two Parameters
        Car car3 = new Car("Tesla", "Model S", 2023); // Constructor with Three Parameters

        System.out.println("Car Details:");
        car1.displayCar();
        car2.displayCar();
        car3.displayCar();
        System.out.println();

        // Demonstrating Method Overloading
        MathOperations math = new MathOperations();
        System.out.println("Addition (int, int): " + math.add(5, 10));
        System.out.println("Addition (int, int, int): " + math.add(5, 10, 15));
        System.out.println("Addition (double, double): " + math.add(5.5, 2.5));
        System.out.println();

        // Demonstrating Getters and Setters
        BankAccount myAccount = new BankAccount(1000.00);
        System.out.println("Initial Balance: $" + myAccount.getBalance());
        myAccount.deposit(500.00);
        System.out.println("Updated Balance: $" + myAccount.getBalance());
        System.out.println();

        // Demonstrating Static Method and Variable
        Utility.printMessage();
        Utility obj1 = new Utility();
        Utility obj2 = new Utility();
        System.out.println("Number of Utility Objects Created: " + Utility.objectCount);
        System.out.println();

        // Demonstrating Final Keyword
        Constants constantObj = new Constants();
        constantObj.showValue();
    }
}
