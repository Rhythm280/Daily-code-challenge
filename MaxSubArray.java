public class MaxSubArray {
    public static void main(String[] args) {
        MaxSubArray solution = new MaxSubArray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = solution.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
