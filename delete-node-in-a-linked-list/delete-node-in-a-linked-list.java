/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) { 
        ListNode iteratorNode = node;
        
        while (true) {
            iteratorNode.val = iteratorNode.next.val;
            
            if (iteratorNode.next.next == null) {
                iteratorNode.next = null;
                break;
            }
            iteratorNode = iteratorNode.next;
        }
    }
}