/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        ListNode node = head;
        
        while (node != null) {
            if (map.containsKey(node)) {
                return true;    
            }
            map.put(node, 1);
            
            node = node.next;    
        }
        
        return false;
    }
}