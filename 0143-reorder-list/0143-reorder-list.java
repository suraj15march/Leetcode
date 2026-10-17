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
    List<Integer> reverseNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        if (head == null)
            return list;
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.reverse(list);
        return list;
    }

    public void reorderList(ListNode head) {
        List<Integer> list = reverseNode(head);
        ListNode temp = head;
        int n = list.size(), i = 0;
       while (temp != null && i < list.size()) {
            ListNode nextOriginal = temp.next;
            
            // If we still have values to weave in, update next
            if (i < list.size()) {
                ListNode middleNode = new ListNode(list.get(i));
                temp.next = middleNode;
                middleNode.next = nextOriginal;
                temp = nextOriginal;
                i++;
            } else {
                break;
            }
        }   
    }
}