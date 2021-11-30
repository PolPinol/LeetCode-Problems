class Solution {
    public boolean isAnagram(String s, String t) {        
        int sum = 0;
        int [] array1 = new int[s.length()];
        int [] array2 = new int[s.length()];
        
        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int c1 = (int) s.charAt(i);
            int c2 = (int) t.charAt(i);
            array1[i] = c1;
            array2[i] = c2;
        }
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        for (int i = 0; i < s.length(); i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
}