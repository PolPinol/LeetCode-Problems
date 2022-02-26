class Solution {
    public boolean isPowerOfThree(int n) {    
        double d = Math.log10(n) / Math.log10(3);
        
        if (n == 0) {
            return false;
        }
        
        return d % 1 == 0;
    }
}