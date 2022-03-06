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
            String aux = new String(tempArray);
            
            if (map.containsKey(aux)) {
                list = map.get(aux);
            } else {
                list = new ArrayList<String>();
            }
            list.add(strs[i]);
            map.put(new String(aux), list);
        }
        
        return map.values().stream().collect(Collectors.toCollection(ArrayList::new));
    }
}