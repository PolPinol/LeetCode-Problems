class Solution {
    public int climbStairs(int n) {
        int sum = 1;
        int before = 1;
        int aux = 0;
        
        for (int i = 2; i <= n; i++) {
            aux = sum;
            sum += before;
            before = aux;
        }
        return sum;
    }    
}