/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        StringBuilder str = new StringBuilder();
        
        while (node != null) {
            str.append(Integer.toString(node.val));
            node = node.next;
        }
        return isPalindrome(str.toString());
    }
    
    public boolean isPalindrome(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != s.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}