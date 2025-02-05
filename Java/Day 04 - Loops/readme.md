## 📌 Overview

Today, we will learn about **loops** in Java, which are used to execute a block of code multiple times. Loops help reduce redundancy and make programs more efficient.

## 📚 Topics Covered

1. **Types of Loops in Java**
   - `for` loop
   - `while` loop
   - `do-while` loop
   - Enhanced `for-each` loop
2. **Loop Control Statements**
   - `break` (to exit a loop)
   - `continue` (to skip an iteration)
3. **Nested Loops**

---

## 1️⃣ **For Loop**

The `for` loop is used when the number of iterations is known beforehand.

### **Syntax:**

```java
for (initialization; condition; update) {
    // Code to be executed
}
```

## **Nested For Loop**

A nested for loop is a for loop inside another for loop. The inner loop runs completely for each iteration of the outer loop.

### **Syntax:**

```java
for (initialization1; condition1; update1) {
    for (initialization2; condition2; update2) {
        // code to be executed
    }
}
```

---

## 2️⃣ **While Loop**

The `while` loop is used when the number of iterations is unknown and depends on a condition.

### **Syntax:**

```java
while (condition) {
    // code to be executed
}
```

## **Nested While Loop**

A nested while loop is a while loop inside another while loop. The inner loop runs completely for each iteration of the outer loop.

### **Syntax:**

```java
while (condition1) {
    while (condition2) {
        // code to be executed
    }
}
```

---

## 3️⃣ **Do-While Loop**

Unlike **while**, the **do-while** loop runs at least once, even if the condition is false.

### **Syntax:**

```java
do {
    // code to be executed
} while (condition);
```

## **Nested Do-While Loop**

A nested do-while loop is a do-while loop inside another do-while loop. The inner loop runs completely for each iteration of the outer loop.

### **Syntax:**

```java
do {
    do {
        // code to be executed
    } while (condition2);
} while (condition1);
```

---

## 4️⃣ **Enhanced For Loop**

Used to iterate over arrays or collections.

### **Syntax:**

```java
for (dataType variable : array) {
    // code to be executed
}
```

## **Nested Enhanced For Loop**

A nested enhanced for loop is an enhanced for loop inside another enhanced for loop. It is often used when working with multi-dimensional arrays or collections.

### **Syntax:**

```java
for (dataType variable1 : array1) {
    for (dataType variable2 : array2) {
        // code to be executed
    }
}
```

---

5️⃣ **Loop Control Statements**

🔹 Break Statement (Exit the loop early)

#### **Syntax:**

```java
for (initialization; condition; update) {
    if (condition) {
        break;
    }
}
```

🔹 Continue Statement (Skip the current iteration)

#### **Syntax:**

```java
for (initialization; condition; update) {
    if (condition) {
        continue;
    }
}
```

---

## 📝 **Key Takeaways**

✔️ Use `for` when you know the number of iterations. <br>
✔️ Use `while` when the condition determines how many times the loop runs. <br>
✔️ Use `do-while` when you want to ensure execution at least once. <br>
✔️ Use `break` to exit a loop early. <br>
✔️ Use `continue` to skip an iteration. <br>

---

## ✅ **Next Steps**

🔹 Practice writing loops in Java. <br>
🔹 Try different conditions and see how they affect execution. <br>
🔹 Implement break and continue in different ways. <br>

---

Happy Coding! 🚀🎯
