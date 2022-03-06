class Solution {
    public String countAndSay(int n) {
        return countAndSay(n, 1, "1");
    }
    
    public String countAndSay(int n, int k, String s) {
        if (n == k) {
            return s;
        } else {
            String aux = say(s);
            System.out.println(aux);
            return countAndSay(n, k+1, aux);
        }
    }
    
    public String say(String s) {
        StringBuilder aux = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            while (i+j < s.length() && s.charAt(i) == s.charAt(i+j)) {
                j++;
            }
            aux.append(Integer.toString(j)).append(s.charAt(i));
            i = i+j-1;
        }
        
        return aux.toString();
    }
}