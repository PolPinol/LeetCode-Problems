class Solution {
    public int reverse(int x) {
        boolean negative = false;
        double out = 0;
        double max =  Math.pow(2, 31);
        if ( x == -2147483648) {
            return 0;
        }
        if (x < 0) {
            negative = true;
        }       
        
        int abs = Math.abs(x);
        String temp = Integer.toString(abs);
        
        
        for (int i = 0; i < temp.length(); i++) {
            out = out + Math.pow(10, i) * Double.parseDouble(String.valueOf(temp.charAt(i)));
        }
        
        if (negative) {
            out = out * (-1);
        }
        
        if ((-1)*max+1 <= out && out <= (max+1)) {
            return (int) out;
        }
        
        return 0;
    }
}