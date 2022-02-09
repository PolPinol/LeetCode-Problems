public class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        
        for (int i = 0; i < binary.length(); i++) {
            count += Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return count;
    }
    
}