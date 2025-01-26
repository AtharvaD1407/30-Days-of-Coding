# Java Introduction Day

Welcome to the Java Introduction Day! This document will guide you through the process of setting up Java on your system and provide a brief introduction to Java programming.

---

## Table of Contents

1. [Introduction to Java](#introduction-to-java)
2. [Installation Process](#installation-process)
   - [Step 1: Download JDK](#step-1-download-jdk)
   - [Step 2: Install JDK](#step-2-install-jdk)
   - [Step 3: Set Up Environment Variables](#step-3-set-up-environment-variables)
   - [Step 4: Verify Installation](#step-4-verify-installation)
3. [Getting Started with Java](#getting-started-with-java)
4. [Conclusion](#conclusion)
5. [Additional Resources](#additional-resources)

---

## Introduction to Java

Java is a popular, high-level, object-oriented programming language that is designed to be platform-independent. It is used to build a wide variety of applications, from web-based systems to mobile applications.

### Key Features of Java:

- **Platform Independent**: Write once, run anywhere.
- **Object-Oriented**: Code is organized around objects rather than actions.
- **Robust and Secure**: Java provides strong memory management and security features.
- **Multi-threaded**: Java supports multi-threading, which allows the execution of multiple tasks at once.

Java is commonly used in software development for building large-scale applications, server-side applications, mobile apps (Android), and much more.

---

## Installation Process

Follow the steps below to install Java on your system.

### Step 1: Download JDK (Java Development Kit)

1. Visit the official Oracle website to download the JDK (Java Development Kit).

   - Link: [Oracle JDK Download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

2. Select the version of JDK you want to install (e.g., JDK 17 or the latest stable version).
   - Choose the correct version for your operating system (Windows, macOS, or Linux).

---

### Step 2: Install JDK

1. After downloading the JDK installer, run it.
2. Follow the instructions provided by the installer.
   - On Windows, this will typically involve clicking "Next" and then selecting the installation folder.
   - On macOS and Linux, you may need to use terminal commands to install it.

---

### Step 3: Set Up Environment Variables

For the system to recognize Java commands, you will need to set the `JAVA_HOME` environment variable.

#### On Windows:

1. Right-click on 'This PC' (or 'My Computer') and select 'Properties.'
2. Click on 'Advanced System Settings.'
3. Click 'Environment Variables.'
4. Under 'System Variables,' click 'New' and enter the following:
   - **Variable Name**: `JAVA_HOME`
   - **Variable Value**: The directory path where Java was installed (e.g., `C:\Program Files\Java\jdk-17`).
5. Find the `Path` variable in the 'System variables' section and click 'Edit.'
6. Add a new entry: `%JAVA_HOME%\bin`

#### On macOS/Linux:

1. Open a terminal window.
2. Add the following lines to your shell configuration file (`.bash_profile`, `.bashrc`, or `.zshrc`):
   ```bash
   export JAVA_HOME=/path/to/jdk
   export PATH=$JAVA_HOME/bin:$PATH
   ```

---

### Step 4: Verify Installation

After installing Java and setting up environment variables, verify the installation:

1. Open a terminal (Command Prompt on Windows or terminal on macOS/Linux).
2. Type the following command:

```bash
java --version
```

3. You should see the installed version of Java (e.g., openjdk version "17").

---

### Getting started with Java

Now that Java is installed, let's write a simple Java program.

Create a new file called HelloWorld.java and add the following code:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java World!");
    }
}
```

### Compiling and Running the Program

1. Open a terminal/command prompt in the directory where HelloWorld.java is saved.
2. To compile the Java code, run:

```bash
javac HelloWorld.java
```

3. To run compiled program, use:

```bash
java HelloWorld
```

You should see the output:

```output
Hello, Java World!
```

---

## Conclusion

Congratulations, you’ve successfully installed Java and run your first Java program!

If you have any questions or need further assistance, feel free to reach out.

Happy coding! 🎉

---

## Additional Resources

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorial](https://www.w3schools.com/java/)
