package main;

/**
 * Utility class for determining if a 2D matrix is a magic square.
 */
public class MagicSquare {

    /**
     * Checks if a given 2D matrix is a magic square.
     * 
     * @param matrix The input 2D array.
     * @return True if the matrix is a magic square; false otherwise.
     */
    public static boolean isMagicSquare(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;
        int sum = 0;

        // Calculate the sum of the first row
        for (int j = 0; j < n; j++) sum += matrix[0][j];

        // Check rows and columns
        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != sum || colSum != sum) return false;
        }

        // Check diagonals
        int diag1Sum = 0, diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += matrix[i][i];
            diag2Sum += matrix[i][n - 1 - i];
        }
        return diag1Sum == sum && diag2Sum == sum;
    }
}

