Today, we will explore Abstraction, one of the four fundamental concepts of Object-Oriented Programming (OOP).

`Abstraction allows you to focus on what an object does rather than how it does it.`

---

## 📌 **What is Abstraction?**

Abstraction is the process of hiding the internal implementation of a class and only showing essential features to the user. It helps in designing clean, organized, and scalable code.

### ✅ **Key Benefits of Abstraction**

✔ Reduces complexity by hiding unnecessary details.
✔ Enhances security by restricting direct access to implementation.
✔ Improves maintainability by separating the interface from the implementation.
✔ Encourages reusability by allowing multiple classes to use a common interface.

---

## 🎯 **Topics Covered in This File**

#### 🔹 1. Abstract Classes

- Defined using the abstract keyword.
- Cannot be instantiated (cannot create objects directly).
- Can contain both abstract (unimplemented) methods and concrete (implemented) methods.
- Subclasses must override abstract methods.

#### 🔹 2. Interfaces

- Defines a set of abstract methods that must be implemented by classes.
- Supports multiple inheritance (unlike abstract classes).
- By default, all methods in an interface are abstract and public.

---

## 📜 **Abstraction.java - Code Structure and Explanation**

The Abstraction.java file demonstrates both abstract classes and interfaces using real-world examples.

#### 1️⃣ **Abstract Class: `Vehicle`**

- Defines an abstract method `start()` which must be implemented by subclasses.
- Includes a concrete method `stop()` that all vehicles share.
- `Car` and `Bike` classes extend `Vehicle` and implement the `start()` method differently.

#### 2️⃣ **Interface: `ElectronicDevice`**

Defines two abstract methods: `turnOn()` and `turnOff()`.
Implemented by `Laptop` and `SmartPhone` classes, each providing a different way to turn devices on and off.

---

## 📌 **Summary of Abstraction**

| **Feature**                                    | **Abstract Class** ✅ | **Interface** 🚀                             |
| ---------------------------------------------- | --------------------- | -------------------------------------------- |
| **Can have both abstract & concrete methods?** | ✅ Yes                | ❌ No, only abstract methods (before Java 8) |
| **Supports multiple inheritance?**             | ❌ No                 | ✅ Yes                                       |
| **Can have instance variables?**               | ✅ Yes                | ❌ No (only constants)                       |
| **Can contain constructors?**                  | ✅ Yes                | ❌ No                                        |

#### 🔹 **When to Use?**

✔ Use abstract classes when classes share common behavior but need different implementations.
✔ Use interfaces when multiple unrelated classes need to implement the same functionality.

---

## 📌 **Conclusion**

Abstraction helps in hiding implementation details and exposing only necessary features.
By using abstract classes and interfaces, we make our code modular, flexible, and easier to maintain.

This is an important concept in OOP that will help us build scalable Java applications. 🎯
