package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.UniqueSubarrays;

/**
 * Unit tests for the UniqueSubarrays class.
 * This class contains test cases to verify the functionality of the 
 * {@link UniqueSubarrays#countUniqueSubarrays(int[], int)} method, 
 * which counts the number of unique subarrays in an integer array 
 * that sum up to a given value.
 */
public class UniqueSubarraysTest {

    /**
     * Test case to count the number of unique subarrays that sum to a given value.
     * In this test, the input array is {1, 2, 3, 4}, and the target sum is 5.
     * The method should return 1 because the subarray [2, 3] is the only 
     * subarray whose sum equals 5.
     */
    @Test
    public void testCountUniqueSubarrays() {
        int[] arr = {1, 2, 3, 4};
        
        // Verify if the countUniqueSubarrays method correctly returns the number of unique subarrays
        // that sum to 5
        assertEquals(1, UniqueSubarrays.countUniqueSubarrays(arr, 5), 
            "The method should return 1 for the given array and sum.");
    }

    /**
     * Test case where no subarrays sum to the given value.
     * In this test, the input array is {1, 2, 3}, and the target sum is 10.
     * Since there are no subarrays that sum up to 10, the method should return 0.
     */
    @Test
    public void testNoSubarrays() {
        int[] arr = {1, 2, 3};
        
        // Verify if the countUniqueSubarrays method correctly returns 0 when no subarrays sum to 10
        assertEquals(0, UniqueSubarrays.countUniqueSubarrays(arr, 10), 
            "The method should return 0 when no subarrays sum to the target value.");
    }

    /**
     * Test case for an empty array.
     * An empty array has no subarrays, so the method should return 0 for any sum value.
     * This test ensures that the method handles edge cases like empty arrays properly.
     */
    @Test
    public void testEdgeCaseEmptyArray() {
        int[] arr = {};
        
        // Verify if the countUniqueSubarrays method returns 0 for an empty array
        assertEquals(0, UniqueSubarrays.countUniqueSubarrays(arr, 5), 
            "The method should return 0 for an empty array.");
    }
}
