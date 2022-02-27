class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int indexNums1 = 0;
        int indexNums2 = 0;
        
        if (n == 0) {
            return;
        }
        
        for (int i = 0; i < (m+n); i++) {
            if (indexNums2 >= n || !queue.isEmpty() && (queue.peek() < nums2[indexNums2])) {
                if (indexNums1 < m) {
                    queue.add(nums1[i]);
                    indexNums1++;
                }
                nums1[i] = queue.poll();
            } else if (nums1[i] <= nums2[indexNums2] && indexNums1 < m) {
                indexNums1++;
            } else {
                if (indexNums1 < m) {
                    queue.add(nums1[i]);
                    indexNums1++;
                }
                nums1[i] = nums2[indexNums2];
                indexNums2++;
            }
        }
    }
}