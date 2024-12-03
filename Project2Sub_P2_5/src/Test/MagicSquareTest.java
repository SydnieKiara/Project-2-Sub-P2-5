package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.MagicSquare;

/**
 * Unit tests for the MagicSquare class.
 * This class contains test cases to verify the functionality of the 
 * {@link MagicSquare#isMagicSquare(int[][])} method, which checks 
 * if a given 2D matrix is a magic square.
 */
public class MagicSquareTest {

    /**
     * Test case to validate a valid 3x3 magic square.
     * A magic square is a matrix where the sum of all rows, columns, 
     * and diagonals are equal. This test verifies that the matrix:
     * 
     * { {8, 1, 6},
     *   {3, 5, 7},
     *   {4, 9, 2} }
     * is correctly identified as a magic square.
     */
    @Test
    public void testValidMagicSquare() {
        int[][] magicSquare = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        // Verify if the isMagicSquare method correctly identifies a magic square
        assertTrue(MagicSquare.isMagicSquare(magicSquare), 
            "The matrix should be identified as a magic square.");
    }

    /**
     * Test case to validate an invalid 3x3 matrix that is not a magic square.
     * This matrix:
     * 
     * { {1, 2, 3},
     *   {4, 5, 6},
     *   {7, 8, 9} }
     * does not meet the criteria for a magic square (sum of rows, columns, 
     * and diagonals are not equal). The test verifies that the matrix 
     * is correctly identified as not being a magic square.
     */
    @Test
    public void testInvalidMagicSquare() {
        int[][] notMagicSquare = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Verify if the isMagicSquare method correctly identifies a non-magic square
        assertFalse(MagicSquare.isMagicSquare(notMagicSquare), 
            "The matrix should not be identified as a magic square.");
    }

    /**
     * Test case for an empty matrix.
     * An empty matrix should not be considered a magic square because it
     * doesn't have any elements, and thus can't satisfy the conditions 
     * for a magic square. This test ensures that the method handles this
     * edge case properly.
     */
    @Test
    public void testEmptyMatrix() {
        int[][] emptyMatrix = {};

        // Verify if the isMagicSquare method returns false for an empty matrix
        assertFalse(MagicSquare.isMagicSquare(emptyMatrix), 
            "An empty matrix should not be identified as a magic square.");
    }
}
