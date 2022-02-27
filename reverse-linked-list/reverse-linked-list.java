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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        if (head.next == null) {
            return head;
        }
        
        ListNode node = head;
        ListNode copyNext = head.next;
        ListNode beforeNode = null;
        
        while (copyNext != null) {
            copyNext = node.next;
            node.next = beforeNode;
            beforeNode = node;
            node = copyNext;
        }
        
        return beforeNode;
    }
}