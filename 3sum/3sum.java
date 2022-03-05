class Solution {
    private Set<ArrayList<Integer>> set;
    private int minNum;
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        if (nums.length != 0) {
            minNum = nums[0];
        }
        
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
                    sort(-target - nums[i], nums[i], target);
                } else {
                    int aux = -target - nums[i];
                    if (aux < minNum && target + nums[i] > target && target + nums[i] > nums[i]) {
                        break;
                    }
                    map.put(aux, 0);
                }
            }
        }
        

        return arrayList;
    }
    
    public void sort(int x, int y, int z) {
        int max = z;
        if (x > max || y > max) {
            if (x > y) {
                max = x;
            } else {
                max = y;
            }
        }
        
        int min = z;
        
        if (x < min || y < min) {
            if (x < y) {
                min = x;
            } else {
                min = y;
            }
        }

        int mid = x + y + z - max - min;
        
        ArrayList<Integer> solution = new ArrayList<Integer>();
        solution.add(min);
        solution.add(mid);
        solution.add(max);
        set.add(solution);
    }
}