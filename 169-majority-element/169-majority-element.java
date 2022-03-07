class Solution {
    public int majorityElement(int[] nums) {
        // Second approach 
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}