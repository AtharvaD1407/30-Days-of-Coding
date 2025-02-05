// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    void eat(String food) {
        System.out.println("Animal is eating: " + food);
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    void eat(String food) {
        System.out.println("Dog is eating: " + food);
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    void eat(String food) {
        System.out.println("Cat is eating: " + food);
    }
}

// Subclass 3
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos");
    }

    @Override
    void eat(String food) {
        System.out.println("Cow is eating: " + food);
    }
}

// Main Class to Demonstrate Dynamic Method Dispatch
public class DynamicDispatch {
    public static void main(String[] args) {
        Animal myAnimal; // Superclass reference

        // Assigning different subclass objects dynamically
        myAnimal = new Dog();
        myAnimal.makeSound(); // Calls Dog's makeSound()
        myAnimal.eat("Bone"); // Calls Dog's eat()

        myAnimal = new Cat();
        myAnimal.makeSound(); // Calls Cat's makeSound()
        myAnimal.eat("Fish"); // Calls Cat's eat()

        myAnimal = new Cow();
        myAnimal.makeSound(); // Calls Cow's makeSound()
        myAnimal.eat("Grass"); // Calls Cow's eat()
    }
}
