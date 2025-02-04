// Inheritance.java

// Superclass (Parent Class)
class Animal {
    // Instance variable
    String name;
    
    // Constructor of the superclass
    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor Called");
    }

    // Superclass method
    void eat() {
        System.out.println(name + " eats food.");
    }

    // Method to show animal sound (generic method)
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass (Child Class) Dog extends Animal
class Dog extends Animal {

    // Constructor of the subclass
    Dog(String name) {
        super(name);  // Calling the superclass constructor to initialize name
        System.out.println("Dog Constructor Called");
    }

    // Method Overriding: Subclass overrides the eat method of Animal class
    @Override
    void eat() {
        super.eat(); // Calling superclass method (Animal's eat method)
        System.out.println(name + " enjoys dog food.");
    }

    // A subclass-specific method
    void bark() {
        System.out.println(name + " barks.");
    }

    // Method Overriding: Specific sound for Dog
    @Override
    void makeSound() {
        System.out.println(name + " barks loudly.");
    }
}

// Another subclass (Child Class) Cat extends Animal
class Cat extends Animal {
    
    // Constructor of the subclass
    Cat(String name) {
        super(name);  // Calling the superclass constructor to initialize name
        System.out.println("Cat Constructor Called");
    }

    // Method Overriding: Subclass overrides the eat method of Animal class
    @Override
    void eat() {
        super.eat(); // Calling superclass method (Animal's eat method)
        System.out.println(name + " enjoys cat food.");
    }

    // A subclass-specific method
    void meow() {
        System.out.println(name + " meows.");
    }

    // Method Overriding: Specific sound for Cat
    @Override
    void makeSound() {
        System.out.println(name + " meows softly.");
    }
}

// A third subclass (Child Class) Bird extends Animal
class Bird extends Animal {

    // Constructor of the subclass
    Bird(String name) {
        super(name);  // Calling the superclass constructor to initialize name
        System.out.println("Bird Constructor Called");
    }

    // Method Overriding: Subclass overrides the eat method of Animal class
    @Override
    void eat() {
        super.eat(); // Calling superclass method (Animal's eat method)
        System.out.println(name + " pecks at seeds.");
    }

    // A subclass-specific method
    void fly() {
        System.out.println(name + " is flying.");
    }

    // Method Overriding: Specific sound for Bird
    @Override
    void makeSound() {
        System.out.println(name + " chirps happily.");
    }
}

// Main class to test Inheritance and all its features
public class Inheritance {

    public static void main(String[] args) {
        
        // Creating instances of the subclasses
        Dog dog = new Dog("Buddy");
        dog.eat();      // Calls the overridden eat() method in Dog
        dog.bark();     // Calls Dog's specific bark() method
        dog.makeSound(); // Calls Dog's overridden makeSound() method

        System.out.println(); // Adding some space between outputs

        Cat cat = new Cat("Whiskers");
        cat.eat();      // Calls the overridden eat() method in Cat
        cat.meow();     // Calls Cat's specific meow() method
        cat.makeSound(); // Calls Cat's overridden makeSound() method

        System.out.println(); // Adding some space between outputs

        Bird bird = new Bird("Sky");
        bird.eat();      // Calls the overridden eat() method in Bird
        bird.fly();      // Calls Bird's specific fly() method
        bird.makeSound(); // Calls Bird's overridden makeSound() method
    }
}
