public class TwoDArray {
    public static void main(String[] args) {

        // 1. 2D Array Declaration and Initialization
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("2D Array (Matrix): ");
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 2. Accessing Elements of a 2D Array
        System.out.println("Element at (1, 2): " + matrix[1][2]);

        // 3. Modifying Elements in a 2D Array
        matrix[1][2] = 10; // modifying element at row 1, column 2
        System.out.println("Modified Matrix: ");
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 4. Finding the Length of a 2D Array
        System.out.println("Number of rows: " + matrix.length);
        System.out.println("Number of columns in the first row: " + matrix[0].length);

        // 5. Traversing/Iterating Over a 2D Array (Nested Loops)
        System.out.println("Traverse Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 6. Searching for an Element in a 2D Array
        boolean found = false;
        int searchElement = 10;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchElement) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println("Element " + searchElement + " found? " + found);

        // 7. Copying a 2D Array
        int[][] copiedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, copiedMatrix[i], 0, matrix[i].length);
        }
        System.out.println("Copied Matrix: ");
        for (int[] row : copiedMatrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 8. Array of Arrays (Jagged Arrays)
        int[][] jaggedArray = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
        System.out.println("Jagged Array: ");
        for (int[] row : jaggedArray) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 9. Matrix Addition
        int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrixB = { { 7, 8, 9 }, { 10, 11, 12 } };
        int[][] sumMatrix = new int[2][3];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Sum of Matrices: ");
        for (int[] row : sumMatrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 10. Matrix Multiplication
        int[][] productMatrix = new int[2][3];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Product of Matrices: ");
        for (int[] row : productMatrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
