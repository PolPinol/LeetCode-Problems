class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]);
            }
            map.put(nums[i], count+1);
        }
        
        for (Integer i : map.keySet()) {
            if (map.get(i) > n/2) {
                return i;
            }
        }
        
        return -1;
    }
}