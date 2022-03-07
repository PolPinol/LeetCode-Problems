class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        if (x == 1) {
            return 1;
        }
        
        if (x == -1) {
            if (n % 2 == 0) {
                return 1;
            } else {
                return -1;
            }
        }
        
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
                if (result == 1 || result == 0) {
                    return result;
                }
            }
        } else if (n == 0) {
            return 1;
        } else {
            x = 1/x;
            for (int i = 0; i > n; i--) {
                result *= x;
                if (result == 1 || result == 0) {
                    return result;
                }
            }
        }
        
        return result;
    }
}