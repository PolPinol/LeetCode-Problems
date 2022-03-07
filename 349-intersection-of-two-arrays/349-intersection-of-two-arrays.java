class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int left = 0;
        int right = 0;
        
        if (nums1.length == 0 || nums2.length == 0) {
            return null;
        }
        
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                if (!temp.contains(nums1[left])) {
                    temp.add(nums1[left]);
                }
                
                left++;
                right++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            } else {
                left++;
            }
        }
        
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }
}