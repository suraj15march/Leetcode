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
        if(head == null) return null;
        int size = 0;
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n==size) return head.next;
        n = size-n;
        while(n>0){
            dummy = dummy.next;
            n--;
        }
dummy.next = dummy.next.next;
        return head;
    }
}