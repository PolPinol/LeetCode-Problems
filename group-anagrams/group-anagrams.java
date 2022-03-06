class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {        
        HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();
        
        for (int i = 0; i < strs.length; i++) {
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String key = new String(tempArray);
            
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                map.put(key, new ArrayList(Arrays.asList(strs[i])));
            }
        }
        
        return new ArrayList(map.values());
    }
}