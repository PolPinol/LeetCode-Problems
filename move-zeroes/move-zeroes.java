class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> index_zeros = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (!index_zeros.isEmpty()) {
                    nums[index_zeros.get(0)] = nums[i];
                    nums[i] = 0;
                    index_zeros.remove(0);
                    index_zeros.add(i);
                }
            } else {
                index_zeros.add(i);
            }
            
        }
    }
}