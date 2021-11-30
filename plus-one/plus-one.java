class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int last;
        
        sum(list, digits, 0);
        
        int size = list.size();
        
        if (size >= digits.length) {
            int [] array = new int[size];
            
            for (int i = 0; i < size; i++) {
                array[size - i - 1] = list.get(i);
            }
            
            return array;
        } else {
            int [] array = new int[digits.length];
            
            for (int i = 0; i < size; i++) {
                array[digits.length - i - 1] = list.get(i);
            }
            
            for (int i = size; i < digits.length; i++) {
                array[digits.length - i - 1] = digits[digits.length - i - 1];
            }
            
            return array;
        }
    }
    
    public void sum(ArrayList<Integer> list, int[] digits, int k) {
        if (k == digits.length) {
            list.add(1);
        } else {
            digits[digits.length - k - 1]++;
            
            if (digits[digits.length - k - 1] == 10) {
                list.add(0);
                sum(list, digits, k+1);
            } else {
                list.add(digits[digits.length - k - 1]);
            }
        }
    }
}