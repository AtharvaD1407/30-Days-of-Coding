# C++ Introduction

Welcome to the C++ Introduction! This document will guide you through the process of setting up C++ on your system and provide a brief introduction to C++ programming.

---

## Table of Contents

1. Introduction to C++
2. Installation Process
   - Step 1: Install a C++ Compiler
   - Step 2: Install a Code Editor (Optional)
   - Step 3: Verify Installation
3. Getting Started with C++
4. Conclusion
5. Additional Resources

---

## Introduction to C++

C++ is a high-performance, general-purpose programming language that supports object-oriented, procedural, and generic programming paradigms. It is widely used in system programming, game development, embedded systems, and more.

### Key Features of C++:

- **High Performance**: C++ offers fast execution and efficient use of system resources.
- **Object-Oriented**: It focuses on using objects to structure programs.
- **Low-Level Manipulation**: Provides control over hardware and memory.
- **Cross-Platform**: Works on various operating systems.
- **Extensive Libraries**: Includes STL (Standard Template Library) and third-party libraries.

C++ is ideal for applications where performance and control are critical.

---

## Installation Process

Follow the steps below to set up C++ on your system.

### Step 1: Install a C++ Compiler

To compile and run C++ programs, you need a compiler like GCC, Clang, or Microsoft Visual C++.

- **On Windows**:

  - Install **MinGW** or **TDM-GCC** as a C++ compiler.
  - Alternatively, install **Visual Studio** (Community Edition) for an all-in-one IDE and compiler.
  - Download MinGW: [MinGW](https://sourceforge.net/projects/mingw/)
  - Download Visual Studio: [Visual Studio](https://visualstudio.microsoft.com/)

- **On macOS**:

  - Install **Xcode Command Line Tools** by running the following command in the terminal:
    ```bash
    xcode-select --install
    ```
  - Alternatively, use **Homebrew** to install GCC:
    ```bash
    brew install gcc
    ```

- **On Linux**:
  - Most distributions come with GCC pre-installed. If not, install it using your package manager:
    ```bash
    sudo apt update && sudo apt install build-essential
    ```

---

### Step 2: Install a Code Editor (Optional)

While you can write C++ code in any text editor, using an Integrated Development Environment (IDE) or code editor can simplify the process.

Popular options:

- **Visual Studio Code**: Lightweight and supports extensions for C++.
  - Download: [Visual Studio Code](https://code.visualstudio.com/)
- **CLion**: A powerful IDE for C++ by JetBrains.
- **Dev-C++**: A beginner-friendly IDE.

---

### Step 3: Verify Installation

Once the compiler is installed, verify it using the following steps:

1. Open a terminal or command prompt.
2. Check the version of your compiler:
   ```bash
   g++ --version
   ```
3. If the installation was successful, you should see the version number of the compiler.

---

### Getting started with C++

Now that C++ is set up, let’s write and run a simple C++ program.

Create a new file called hello_world.cpp and add the following code:

```cpp
#include <iostream>
using namespace std;

int main() {

    cout << "Hello, C++ World!" << endl;

    return 0;
}
```

### Compiling and Running the Program

1. Open a terminal or command prompt in the directory where hello_world.cpp is saved.
2. Compile the program using the following command:

```bash
g++ hello_world.cpp -o hello_world
```

- This will create an executable file named hello_world

3. Run the program:

```bash
./hello_world  # On Linux/macOS
hello_world.exe  # On Windows
```

You should see the output:

```output
Hello, C++ World!
```

---

## Conclusion

Congratulations, you’ve successfully installed a C++ compiler and run your first C++ program! 🎉

If you have any questions or need further assistance, feel free to reach out.

---

## Additional Resources

- [C++ Documentation](https://devdocs.io/cpp/)
- [C++ Tutorial](https://www.w3schools.com/cpp/)
