class Solution {
    public int firstUniqChar(String s) {
        int[][] repes = new int[26][2];
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            repes[c - 97][0]++;
            repes[c - 97][1] = i;
        }
        
        for (int i = 0; i < 26; i++) {
            if (repes[i][0] == 1 && repes[i][1] < min) {
                min = repes[i][1];
            }
        }
        
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        
        return min;
    }
}