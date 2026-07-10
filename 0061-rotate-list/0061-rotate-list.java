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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        k = k%size;
        if(k==0) return head;
        k = size-k;
        curr = head;
        ListNode dummy = new ListNode();
        while(k>0){
            dummy = curr;
            curr = curr.next;
            k--;
        }
        ListNode temp = curr;
        dummy.next = null;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = head;
        return temp;
    }
}