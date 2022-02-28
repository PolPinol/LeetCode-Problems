class Solution {
    private int[] nums;
    
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() { 
        int[] nums_shuffled = new int[nums.length];
        
        ArrayList<Integer> randomSequence = new ArrayList<Integer>();   
        Random randomGenerator = new Random();
        while (randomSequence.size() < nums.length) {
            int random = randomGenerator.nextInt(nums.length);
            if (!randomSequence.contains(random)) {
                randomSequence.add(random);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums_shuffled[i] = nums[randomSequence.get(i)];
        }
        
        return nums_shuffled;
    }
    
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */