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
        ListNode reversed = new ListNode(head.val, head.next);
        reversed = reverseList(reversed);
        
        while (node != null) {
            if (reversed.val != node.val) {
                return false;
            }
            
            reversed = reversed.next;
            node = node.next;
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        if (head.next == null) {
            return head;
        }
        
        ListNode node = head;
        ListNode copyNext = copyNode(head.next);
        ListNode beforeNode = null;
        
        while (copyNext != null) {
            copyNext = copyNode(node.next);
            node.next = copyNode(beforeNode);
            beforeNode = copyNode(node);
            node = copyNode(copyNext);
        }
        
        return beforeNode;
    }
    
    public ListNode copyNode(ListNode node) {
        if (node == null) {
            return null;
        } else {
            return new ListNode(node.val, node.next);
        }
    }
}