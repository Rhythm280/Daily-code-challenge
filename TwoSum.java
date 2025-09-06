import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(result.toString());
    }

    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            // Calculate the complement needed to reach the target
            int complement = target - currentNum;

            // Check if the complement already exists in the HashMap
            if (numMap.containsKey(complement)) {
                // If found, return the index of the complement and the current index
                return new int[] { numMap.get(complement), i };
            }

            // If the complement is not found, add the current number and its index to the
            // HashMap
            numMap.put(currentNum, i);
        }

        // If no solution is found (though the problem statement usually guarantees
        // one),
        // an empty array or an appropriate error handling can be returned.
        return new int[0]; // Or throw an IllegalArgumentException
    }
}
