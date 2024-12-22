package Practice;


import java.util.*;

public class NextSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices if found
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found (shouldn't happen as per the problem statement)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = findTwoSum(nums1, target1);
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = findTwoSum(nums2, target2);
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = findTwoSum(nums3, target3);
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
    }
}
