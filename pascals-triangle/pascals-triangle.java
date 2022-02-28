class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        
        if (numRows > 0) {
            solution.add(new ArrayList<Integer>(Arrays.asList(1)));
        }
        
        if (numRows > 1) {
            solution.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        }
        
        for (int i = 3; i <= numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            List<Integer> previous = solution.get(i-2);
            
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i-1) {
                    list.add(1);
                } else {
                    list.add(previous.get(j-1) + previous.get(j));
                }
            }
            
            solution.add(list);
        }
        
        return solution;
    }
}