class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //   value to find, index of previous value
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int[] solution = new int[2];
                
                solution[0] = map.get(nums[i]);
                solution[1] = i;
                
                return solution;
            } else {
                int aux = target - nums[i];
                map.put(aux, i);
            }
        }

        return null;
    }
}