class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] two = new int[2];
        int [] val = new int[2];
        int[] copiedArray = nums.clone();
        Arrays.sort(nums);
                
        for (int i = 0; i < (nums.length-1); i++) {
            for (int j = (i+1); j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    val[0] = nums[i];
                    val[1] = nums[j];
                    i =  nums.length-1;
                    break;
                } else if (nums[i] + nums[j] > target) {
                    break;
                }
            }
        }
        
        two[0] = -1;
        two[1] = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (copiedArray[i] == val[0] && two[0] == -1) {
                two[0] = i;
            } else if (copiedArray[i] == val[1] && two[1] == -1) {
                two[1] = i;
            }
            
            if (two[0] != -1 && two[1] != -1) {
                return two;
            }
        }
        
        return two;
    }
}