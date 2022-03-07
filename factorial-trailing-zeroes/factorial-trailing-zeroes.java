class Solution {
    public int trailingZeroes(int n) {
        // 5 * 4 * 3 * 2 * 1
        // trailing zeroes = 10 + 5*2
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0) {
                count += 1 + getDiv(i/5);
            }
        }
        return count;
    }
    
    public int getDiv(int n) {
        if (n % 5 == 0) {
            return 1 + getDiv(n/5);
        }
        return 0;
    }
}