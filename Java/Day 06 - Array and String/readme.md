## Overview

In this , I have focused on implementing fundamental operations in **Arrays** and **Strings** using Java. The operations demonstrated in these files include array manipulation (1D and 2D arrays), matrix operations (addition and multiplication), string handling, and more. The files are organized into a structure that makes it easy to explore array operations and string manipulations.

## File Structure

```
📂 Array
┃ ┣ OneDArray.java
┃ ┣ TwoDArray.java
┃ Strings.java
┃ readme.md
┃ questions.md
```

- **OneDArray.java**: This file demonstrates **1D Array** operations such as initialization, access, modification, sorting, and searching.
- **TwoDArray.java**: This file covers **2D Arrays (Matrices)**, showing how to work with 2D arrays, including matrix addition, multiplication, and traversal.
- **Strings.java**: This file contains a variety of **String manipulations**, including concatenation, comparison, trimming, and converting strings to other formats like upper/lowercase.

---

## Contents

### OneDArray: 1D Array Operations

| **Topic**                              | **Syntax/Approach**                                                                  |
| -------------------------------------- | ------------------------------------------------------------------------------------ |
| **Array Declaration & Initialization** | Declare an array and initialize it with values.                                      |
| **Accessing Array Elements**           | Use the index to access specific elements in the array.                              |
| **Modifying Array Elements**           | Assign a new value to an element using its index.                                    |
| **Array Length**                       | Use `.length` property to get the size of the array.                                 |
| **Traversing the Array**               | Use a loop to iterate through each element of the array.                             |
| **Searching for an Element**           | Use a loop to compare each element with the target value.                            |
| **Array Copying**                      | Copy elements from one array to another using a built-in copy method.                |
| **Array Sorting**                      | Sort the array using a built-in sorting method.                                      |
| **Reversing an Array**                 | Reverse the array by swapping elements from both ends.                               |
| **Filling an Array**                   | Use a built-in method to fill all elements of the array with a specific value.       |
| **Array to String**                    | Convert the array to a string representation using a utility method.                 |
| **Finding Max & Min**                  | Use stream operations or a loop to find the maximum and minimum values in the array. |

---

### TwoDArray: 2D Array Operations

| **Topic**                                 | **Syntax/Approach**                                                                                          |
| ----------------------------------------- | ------------------------------------------------------------------------------------------------------------ |
| **2D Array Declaration & Initialization** | Declare and initialize a 2D array (matrix) with values.                                                      |
| **Accessing Elements**                    | Use row and column indices to access elements in the 2D array.                                               |
| **Modifying Elements**                    | Assign a new value to a specific row and column in the 2D array.                                             |
| **Finding Length of a 2D Array**          | Use `.length` to get the number of rows; use `.length` on a row to get the number of columns.                |
| **Traversing a 2D Array**                 | Use nested loops to iterate through rows and columns of the matrix.                                          |
| **Searching for an Element**              | Use nested loops to check if any element matches the target.                                                 |
| **Array Copying**                         | Copy each row of the original 2D array to a new array using a loop or utility method.                        |
| **Jagged Arrays (Array of Arrays)**       | Initialize arrays where each row can have a different number of columns (non-rectangular).                   |
| **Matrix Addition**                       | Add corresponding elements of two matrices using nested loops.                                               |
| **Matrix Multiplication**                 | Perform matrix multiplication using nested loops to calculate the product of corresponding rows and columns. |

---

### Strings: String Manipulation Operations

| **Topic**                                    | **Syntax/Approach**                                                                                                      |
| -------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------ |
| **String Declaration & Initialization**      | Declare and initialize a string with a value.                                                                            |
| **Accessing Characters**                     | Use the `.charAt(index)` method to retrieve a character at a specific index.                                             |
| **Modifying a String**                       | Modify a string by using a mutable object like `StringBuilder`.                                                          |
| **Finding String Length**                    | Use `.length()` to get the length of the string.                                                                         |
| **Concatenating Strings**                    | Combine two or more strings using `concat()` or the `+` operator.                                                        |
| **Comparing Strings**                        | Compare strings using `.equals()` for exact matches or `.compareTo()` for lexicographical comparison.                    |
| **Converting String to Uppercase/Lowercase** | Use `.toUpperCase()` or `.toLowerCase()` to convert the string to uppercase or lowercase.                                |
| **Checking for Substring Presence**          | Use `.contains()` to check if a substring is present in the string.                                                      |
| **Trimming Whitespace**                      | Use `.trim()` to remove leading and trailing whitespace from the string.                                                 |
| **Splitting a String**                       | Use `.split()` to divide a string into an array of substrings based on a delimiter.                                      |
| **Replacing Characters/Substrings**          | Use `.replace()` to replace characters or substrings in the string.                                                      |
| **Extracting Substrings**                    | Use `.substring(start, end)` to extract a portion of the string.                                                         |
| **String to Character Array**                | Use `.toCharArray()` to convert the string into a character array.                                                       |
| **Checking if String is Empty**              | Use `.isEmpty()` to check if the string is empty.                                                                        |
| **String Formatting**                        | Use `String.format()` to create formatted strings with placeholders.                                                     |
| **String Search (Index of)**                 | Use `.indexOf()` to find the first occurrence of a character or substring, and `.lastIndexOf()` for the last occurrence. |
| **Removing Specific Characters**             | Use `.replace()` to remove specific characters or substrings from the string.                                            |
| **Converting String to Integer**             | Use `Integer.parseInt()` to convert a string containing a number into an integer.                                        |

---

## Conclusion

I have focused on mastering the **basic operations on arrays and strings** in Java. These operations form the building blocks of many real-world applications, and understanding how to work with arrays and strings efficiently is crucial for any developer.

Stay tuned for more learning in the coming days! Feel free to explore the code and experiment with the operations outlined in these files. Happy Coding! 🚀
