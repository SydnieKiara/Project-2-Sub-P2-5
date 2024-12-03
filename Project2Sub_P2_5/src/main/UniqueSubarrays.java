package main;

import java.util.HashSet;

/**
 * Utility class for counting unique subarrays with a given sum.
 */
public class UniqueSubarrays {

    /**
     * Counts the number of unique subarrays whose sum equals the given target.
     * 
     * @param arr The input integer array.
     * @param target The target sum.
     * @return The number of unique subarrays that sum to the target value.
     */
    public static int countUniqueSubarrays(int[] arr, int target) {
        HashSet<String> uniqueSubarrays = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            StringBuilder subarray = new StringBuilder();
            for (int j = i; j < n; j++) {
                sum += arr[j];
                subarray.append(arr[j]).append(",");
                if (sum == target) {
                    uniqueSubarrays.add(subarray.toString());
                }
            }
        }
        return uniqueSubarrays.size();
    }
}
