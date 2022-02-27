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
        int value = node.val;
        System.out.println(node);
        System.out.println(node.val);
        
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