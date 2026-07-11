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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        Map<Integer, Integer>map = new HashMap();
        ListNode current = head;
        while(current != null){
            int temp = current.val;
            if(!map.containsKey(temp)) map.put(temp, 1);
            else map.put(temp, map.get(temp)+1);
            current = current.next;
        }
        current = head;
        ListNode list = new ListNode(0);
        ListNode ans = list;
        while(current != null){
            int temp = current.val;
            if(map.get(temp)==1){
                list.next = new ListNode(temp);
                list = list.next;
            }
            current = current.next;
        }
        return ans.next;
    }
}