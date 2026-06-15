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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode temp = slow;
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null)
            slow.next = slow.next.next;
        else
            temp.next = temp.next.next;
        return head;
    }
}