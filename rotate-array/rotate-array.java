class Solution {
    public void rotate(int[] nums, int k) {
        int counterBucle = 0;
        int size = nums.length;
        int copia = nums[0];
        int copia2;
        int i = 0;
        int index = 0;
        int init = 0;
        
        if (k > 0 && size > 1 && size != k) {
            while (i != size) {
                index = (index + k)%size;
                copia2 = nums[index];
                nums[index] = copia;
                copia = copia2;
                i++;
                if (index == init) {
                    init++;
                    index = init;
                    copia = nums[init];
                }
                
            }
        }
    
    }
}