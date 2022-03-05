class Solution {
    private Set<ArrayList<Integer>> set;
    
    public List<List<Integer>> threeSum(int[] nums) {
        this.set = new HashSet<ArrayList<Integer>>();
        
        for (int i = 0; i < nums.length; i++) {
            twoSum(nums, nums[i], i);
        }
        
        return new ArrayList<>(set);
    }
    
    public ArrayList<ArrayList<Integer>> twoSum(int[] nums, int target, int numOut) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i != numOut) {
                if (map.containsKey(nums[i])) {
                    ArrayList<Integer> solution = new ArrayList<Integer>();
                    solution.add(-target - nums[i]);
                    solution.add(nums[i]);
                    solution.add(target);
                    Collections.sort(solution);
                    set.add(solution);
                    map.remove(nums[i]);
                } else {
                    int aux = -target - nums[i];
                    map.put(aux, 0);
                }
            }
        }
        

        return arrayList;
    }
}