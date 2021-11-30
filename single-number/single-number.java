class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int number = nums[0];
        int ite = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (number == nums[i]) {
                ite++;
            } else if (ite < 1) {
                return number;
            } else {
                ite = 0;
                number = nums[i];
            }
        }
        
        return nums[nums.length-1];
        
    }
}