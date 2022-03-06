class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solution = new ArrayList<>();
        
        if (strs.length == 0) {
            return solution;
        }
        
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < strs.length; i++) {
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            System.out.println(tempArray);
            String aux = new String(tempArray);
            if (map.containsKey(aux)) {
                System.out.println("BBB");
                list = map.get(aux);
            } else {
                list = new ArrayList<String>();
            }
            list.add(strs[i]);
            map.put(new String(aux), list);
        }
        
        for (ArrayList<String> a : map.values()) {
            System.out.println(a);
            System.out.println("AAA");
        }
        
        return map.values().stream().collect(Collectors.toCollection(ArrayList::new));
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