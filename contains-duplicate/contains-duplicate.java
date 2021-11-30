import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {        
        Integer[] wrapper = new Integer[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            wrapper[i] = nums[i];
        }
        
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(wrapper));
        return set.size() != nums.length;
    }
}