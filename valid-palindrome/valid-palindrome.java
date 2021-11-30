class Solution {
    public boolean isPalindrome(String s) {
        int index_in = 0;
        int index_end = s.length()-1;
        
        while (index_in < index_end) {
            
            if (Character.isLetterOrDigit(s.charAt(index_in))) {
                if (Character.isLetterOrDigit(s.charAt(index_end))) {
                    char c1 = Character.toLowerCase(s.charAt(index_in));
                    char c2 = Character.toLowerCase(s.charAt(index_end));
                    if (c1 != c2) {
                        return false;
                    }
                    index_end--;
                    index_in++;
                } else {
                    index_end--;
                }
            } else {
                index_in++;
            }            
        }
                
        return true;
    }
}