class Solution {
    public boolean isPowerOfThree(int n) {    
        double d = Math.log(n) / Math.log(3);
        
        if (n == 0) {
            return false;
        }
        
        if (d % 1 < 1 && d % 1 > 0.999999999999) {
            return true;
        }
        
        return d % 1 == 0;
    }
}