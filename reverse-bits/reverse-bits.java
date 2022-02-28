public class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder reversed = new StringBuilder(binary).reverse();
        
        for (int i = 0; i < (32-binary.length()); i++) {
            reversed.append("0");
        }
        
        return (int) Long.parseLong(reversed.toString(),2);
    }
}