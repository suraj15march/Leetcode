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
        if(head == null) return false;
        Set<ListNode> set = new HashSet<>();
        ListNode temp = new ListNode();
        temp = head;
        while(!set.contains(temp)){
            if(temp==null) return false;
            set.add(temp);
            temp = temp.next;
        }
        return true;
    }
}