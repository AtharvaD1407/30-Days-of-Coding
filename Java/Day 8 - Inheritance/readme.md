# Inheritance in Java

## 📚 Overview

This project demonstrates **Inheritance** in Java, one of the key concepts in Object-Oriented Programming (OOP). The implementation showcases how a superclass (or parent class) can be extended by subclasses (child classes) to reuse code and override methods, while maintaining the flexibility to add specific functionality in each subclass.

The code example models a simple hierarchy of animals (`Animal`, `Dog`, `Cat`, and `Bird`), with each class inheriting behaviors from the `Animal` superclass and adding its own unique functionality.

---

## 🖥️ File: `Inheritance.java`

### 🐾 **Class Overview:**

#### 1. **Animal Class** (Superclass):
   - The `Animal` class serves as the base class for all animals.
   - Contains a field `name` to store the animal's name.
   - Has a constructor to initialize the `name` field.
   - Defines the generic `eat()` and `makeSound()` methods, which are inherited by subclasses.

#### 2. **Dog Class** (Subclass of `Animal`):
   - Extends the `Animal` class.
   - Overrides the `eat()` method to specify that dogs enjoy dog food.
   - Introduces a new method `bark()` to represent a dog’s behavior.
   - Overrides the `makeSound()` method to give a dog-specific sound.

#### 3. **Cat Class** (Subclass of `Animal`):
   - Extends the `Animal` class.
   - Overrides the `eat()` method for cat-specific eating behavior.
   - Introduces a new method `meow()` for the cat’s behavior.
   - Overrides the `makeSound()` method to give a cat-specific sound.

#### 4. **Bird Class** (Subclass of `Animal`):
   - Extends the `Animal` class.
   - Overrides the `eat()` method to describe how birds eat.
   - Introduces a new method `fly()` to represent the bird's ability to fly.
   - Overrides the `makeSound()` method for bird-specific sounds.

---

### 💡 **Key Concepts Demonstrated:**

- **Inheritance**: Subclasses (`Dog`, `Cat`, `Bird`) inherit properties and methods from the superclass (`Animal`).

- **Method Overriding**: Subclasses override methods like `eat()` and `makeSound()` to implement specific behaviors for each animal.

- **Constructors**: The constructor of the superclass (`Animal`) is invoked using `super()` in each subclass to initialize the `name` field.

- **Polymorphism**: The same method (`makeSound()`) behaves differently in each subclass, demonstrating polymorphism.

- **Code Reusability**: Common behaviors (like `eat()`) are inherited and can be extended or modified by subclasses.

---

## 🔑 **Concepts in Action:**

- **Inheritance:** Subclasses like `Dog`, `Cat`, and `Bird` inherit common properties and behaviors from the `Animal` class, avoiding code duplication.

- **Method Overriding:** Each subclass customizes the `eat()` and `makeSound()` methods to represent its unique behavior.

- **Constructors:** Every subclass calls the constructor of `Animal` using `super(name)` to initialize the inherited `name` field.

- **Polymorphism:** Different animals override the `makeSound()` method to provide different sounds, showcasing polymorphic behavior in action.

---

## 🚀 **Learning Goals:**

- Understand how inheritance works in Java.
- Learn how to override methods in subclasses to provide custom behavior.
- Get familiar with constructors and how they are inherited.
- Explore the concept of polymorphism in the context of inheritance.

---

## 🚀 **How to Run:**

1. Clone the repository or download the `Inheritance.java` file.
2. Open a terminal or command prompt and navigate to the directory containing `Inheritance.java`.
3. Compile the Java file:
   ```bash
   javac Inheritance.java
   ```

---

## 💡 Conclusion

This project provides a solid understanding of **Inheritance** in Java, empowering you to write cleaner, modular, and maintainable code. With these principles in mind, you can tackle more complex Java projects with confidence.