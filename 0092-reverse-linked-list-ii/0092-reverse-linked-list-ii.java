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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0, head);
        ListNode preLeft = dummy;
        for(int i=0; i<left-1;i++){
            preLeft = preLeft.next;
            curr = curr.next;
        }

        int diff = right-left+1;
        ListNode prev = null;
        ListNode preCurr = curr;
        while(diff>0){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            diff--;
        }
        preCurr.next = curr;
        preLeft.next = prev;
        return dummy.next;
    }
}