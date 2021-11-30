class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");
        char aux;
        int index = 0;
        
        while(true) {
            if (strs[0].length() <= index) {
                return prefix.toString();
            }
            aux = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= index) {
                    return prefix.toString();
                }
                
                if (aux != strs[i].charAt(index)) {
                    return prefix.toString();
                }
            }
            prefix.append(aux);
            index++;
        }
        
        //return prefix.toString();
    }
}