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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode head = new ListNode();
        ListNode node;
        ListNode nodeBefore = head;
        
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        
        while (true) {
            if (list1 == null) {
                node = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null || list1.val < list2.val) {
                node = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                node = new ListNode(list2.val);
                list2 = list2.next;
            }
            
            nodeBefore.val = node.val;
            if (list1 == null && list2 == null) {
                nodeBefore.next = null;
                break;   
            }
            nodeBefore.next = node;
            nodeBefore = node;
        }
        
        return head;
    }
}