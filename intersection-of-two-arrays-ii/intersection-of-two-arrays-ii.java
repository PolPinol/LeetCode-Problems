class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> inter = new ArrayList<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int size_nums1 = nums1.length;
        int size_nums2 = nums2.length;
        
        int index1 = 0;
        int index2 = 0;
        
        while (true) {
            if (size_nums1 <= index1 || size_nums2 <= index2) {
                break;
            }
            
            if (nums1[index1] == nums2[index2]) {
                inter.add(nums1[index1]);
                index1++;
                index2++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                index1++;
            }
        }
        
        int [] array = new int[inter.size()];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = inter.get(i);
        }
        return array;
        
    }
}