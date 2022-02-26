class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > sum+nums[i]) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}