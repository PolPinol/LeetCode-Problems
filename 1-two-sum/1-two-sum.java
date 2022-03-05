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
                //map.put(nums[i], 1);
                //break;
            } else {
                int aux = target - nums[i];
                map.put(aux, i);
            }
        }
        
        //ArrayList<Integer> arrayList = new ArrayList<>();
        //int[] solution = new int[2];
        
        /*
        for (int n : map.keySet()) {
            if (map.get(n) == 1) {
                //arrayList.add(n);
                solution[0] = target - n;
                solution[1] = n;
            }
        }*/

        return null;
    }
}