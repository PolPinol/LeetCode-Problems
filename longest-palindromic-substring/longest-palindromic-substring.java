class Solution {
    public String longestPalindrome(String s) {
        String palindrome = "";
        int n = s.length();
        
        int i = 0;
        int j = 0;
        while (i < n) {
            j = 0;
            while (j < n) {
                if (i < n-j && (n-j-i) > palindrome.length()) {
                    String aux = s.substring(i, n-j);
                    if (isPalindrome(aux)) {
                        palindrome = aux;
                    }
                }
                j++;
            }
            i++;
        }
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {                
                if (i < n-j && (n-j-i) > palindrome.length()) {
                    String aux = s.substring(i, n-j);
                    if (isPalindrome(aux)) {
                        palindrome = aux;
                    }
                }
            }
        }*/
        
        return palindrome;
    }
    
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}