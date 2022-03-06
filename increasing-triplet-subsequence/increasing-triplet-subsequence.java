class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean solution = false;
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
            } else if (nums[i] <= mid) {
                mid = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        
        if (min < mid && mid < max && 
            min != Integer.MAX_VALUE && mid != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            return true;
        }
        
        
        
        return false;
    }
}