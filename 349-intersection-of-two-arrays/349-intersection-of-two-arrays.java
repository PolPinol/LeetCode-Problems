class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> temp = new HashSet<Integer>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int left = 0;
        int right = 0;
        
        if (nums1.length == 0 || nums2.length == 0) {
            return null;
        }
        
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                temp.add(nums1[left]);
                
                left++;
                right++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            } else {
                left++;
            }
        }
        
        int[] solution = new int[temp.size()];
        Iterator values = temp.iterator();
        
        int t = 0;
        while (values.hasNext()) {
            solution[t] = (int) values.next();
            t++;
        }
        
        return solution;
    }
}