class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int lastNumber;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
}