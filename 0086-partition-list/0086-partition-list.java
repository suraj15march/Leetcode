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
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode beforeHead = before;
        ListNode afterHead = after;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                before.next = new ListNode(curr.val);
                before = before.next;
            }
            else {
                after.next = new ListNode(curr.val);
                after = after.next;
            }
            curr = curr.next;
        }
        after.next = null;
        before.next = afterHead.next;
        return beforeHead.next;
    }
}