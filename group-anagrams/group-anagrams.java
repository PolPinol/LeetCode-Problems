class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solution = new ArrayList<>();
        
        if (strs.length == 0) {
            return solution;
        }
        
        /*
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < strs.length; i++) {
            flagInserted = false;
            
            for (String key : map.keySet()) {
                if (isAnagram(strs[i], key) {
                    solution.get(j).add(strs[i]);
                    map.put();
                    break;
                }
            }
            
            list = new ArrayList<String>();
            list.add(strs[i]);
            solution.add(list);
        }*/
        
        ArrayList<String> list = new ArrayList<String>();
        boolean flagInserted = false;
        
        for (int i = 0; i < strs.length; i++) {
            flagInserted = false;
                for (int j = 0; j < solution.size(); j++) {
                    if (isAnagram(strs[i], solution.get(j).get(0))) {
                        flagInserted = true;
                        solution.get(j).add(strs[i]);
                        break;
                    }
                }
            
            
            if (!flagInserted) {
                list = new ArrayList<String>();
                list.add(strs[i]);
                solution.add(list);
            }
        }
        
        return solution;
    }
    
    public boolean isAnagram(String s1, String s2) {
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        }
        
        if (s1.length() != s2.length()) {
            return false;
        }
        
        char tempArray1[] = s1.toCharArray();
        char tempArray2[] = s2.toCharArray();
        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);
        
        for (int i = 0; i < s1.length(); i++) {
            if (tempArray1[i] != tempArray2[i]) {
                return false;
            }
        }
        return true;
    }
}