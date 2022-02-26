class Solution {
    public boolean isPowerOfThree(int n) {            
        return n == 0 ? false : Math.log10(n) / Math.log10(3) % 1 == 0;
    }
}