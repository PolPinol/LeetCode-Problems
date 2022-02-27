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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int index = 0;
        ListNode node = head;
        
        while (true) {
            int option = getNode(node, 1, n);
            if (option == 0) {
                node.next = node.next.next;
                break;
            } else if (option == 1) {
                node = node.next;
            } else {
                return node.next;
            }
        }
        return head;
    }
    
    /*
    * 0 -> next node to eliminate
    * 1 -> dont eliminate
    * 2 -> first node to eliminate
    */
    public int getNode(ListNode node, int k, int n) {
        if (k-1 == n) {
            if (node.next == null) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (node.next == null) {
                System.out.println("A");
                return 2;
            }
            return getNode(node.next, k+1, n);
        }
    }
}