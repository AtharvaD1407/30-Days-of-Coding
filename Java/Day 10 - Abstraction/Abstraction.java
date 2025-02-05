// Abstract class representing a Vehicle
abstract class Vehicle {
    int speed;

    // Constructor for Vehicle
    Vehicle(int speed) {
        this.speed = speed;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void start();

    // Concrete method (common to all vehicles)
    void stop() {
        System.out.println("The vehicle is stopping.");
    }
}

// Car class extending Vehicle and providing implementation for abstract method
class Car extends Vehicle {
    String brand;

    // Constructor to initialize Car
    Car(String brand, int speed) {
        super(speed);
        this.brand = brand;
    }

    // Implementing abstract method start()
    void start() {
        System.out.println(brand + " car starts at speed " + speed + " km/h.");
    }
}

// Bike class extending Vehicle and providing implementation for abstract method
class Bike extends Vehicle {
    String model;

    // Constructor to initialize Bike
    Bike(String model, int speed) {
        super(speed);
        this.model = model;
    }

    // Implementing abstract method start()
    void start() {
        System.out.println(model + " bike starts at speed " + speed + " km/h.");
    }
}

// Interface representing an Electronic Device
interface ElectronicDevice {
    void turnOn(); // Abstract method

    void turnOff(); // Abstract method
}

// Laptop class implementing ElectronicDevice interface
class Laptop implements ElectronicDevice {
    String brand;

    // Constructor for Laptop
    Laptop(String brand) {
        this.brand = brand;
    }

    // Implementing turnOn method from interface
    public void turnOn() {
        System.out.println(brand + " laptop is turning on.");
    }

    // Implementing turnOff method from interface
    public void turnOff() {
        System.out.println(brand + " laptop is shutting down.");
    }
}

// SmartPhone class implementing ElectronicDevice interface
class SmartPhone implements ElectronicDevice {
    String model;

    // Constructor for SmartPhone
    SmartPhone(String model) {
        this.model = model;
    }

    // Implementing turnOn method from interface
    public void turnOn() {
        System.out.println(model + " smartphone is powering on.");
    }

    // Implementing turnOff method from interface
    public void turnOff() {
        System.out.println(model + " smartphone is shutting down.");
    }
}

// Main class to test abstraction concepts
public class Abstraction {
    public static void main(String[] args) {
        // Working with Abstract Classes
        Vehicle myCar = new Car("Toyota", 120);
        myCar.start(); // Calls Car's start method
        myCar.stop(); // Calls concrete method from Vehicle

        Vehicle myBike = new Bike("Yamaha", 80);
        myBike.start(); // Calls Bike's start method
        myBike.stop(); // Calls concrete method from Vehicle

        System.out.println("----------------------------");

        // Working with Interfaces
        ElectronicDevice myLaptop = new Laptop("Dell");
        myLaptop.turnOn(); // Calls Laptop's turnOn method
        myLaptop.turnOff(); // Calls Laptop's turnOff method

        ElectronicDevice myPhone = new SmartPhone("iPhone 15");
        myPhone.turnOn(); // Calls SmartPhone's turnOn method
        myPhone.turnOff(); // Calls SmartPhone's turnOff method
    }
}
