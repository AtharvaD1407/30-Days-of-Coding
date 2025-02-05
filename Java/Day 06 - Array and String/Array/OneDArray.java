public class OneDArray {

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 1. Array Declaration and Initialization
        int[] arr = { 1, 2, 3, 4, 5 }; // initializing array with values
        System.out.println("Array: ");
        printArray(arr);

        // 2. Accessing Elements of an Array
        System.out.println("Element at index 2: " + arr[2]);

        // 3. Modifying Elements in an Array
        arr[2] = 10; // modifying the element at index 2
        System.out.println("Modified Array: ");
        printArray(arr);

        // 4. Finding Length of an Array
        System.out.println("Length of the array: " + arr.length);

        // 5. Traversing/Iterating Over an Array
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 6. Searching for an Element in an Array (Linear Search)
        int key = 10;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println("Element " + key + " found at index: " + index);

        // 7. Copying an Array
        int[] copiedArr = new int[arr.length];
        System.arraycopy(arr, 0, copiedArr, 0, arr.length);
        System.out.println("Copied Array: " + java.util.Arrays.toString(copiedArr));

        // 8. Array Sorting
        java.util.Arrays.sort(arr); // sorting array in ascending order
        System.out.println("Sorted Array: ");
        printArray(arr);

        // 9. Reversing an Array
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Reversed Array: ");
        printArray(reversedArr);

        // 10. Filling an Array with a Specific Value
        java.util.Arrays.fill(arr, 7); // fill all elements with value 7
        System.out.println("Array filled with 7: ");
        printArray(arr);

        // 11. Converting Array to String
        System.out.println("Array as String: " + java.util.Arrays.toString(arr));

        // 12. Finding Maximum and Minimum Elements
        int max = java.util.Arrays.stream(arr).max().getAsInt();
        int min = java.util.Arrays.stream(arr).min().getAsInt();
        System.out.println("Max: " + max + ", Min: " + min);

    }
}
