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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = 0;  
        int ans = 0;

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (l1 != null && l2 != null) {

            ans = l1.val + l2.val + sum;
            sum = ans / 10;
            ans = ans % 10;

            dummy.next = new ListNode(ans);
            dummy = dummy.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {

            ans = l1.val + sum;
            sum = ans / 10;
            ans = ans % 10;

            dummy.next = new ListNode(ans);
            dummy = dummy.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            ans = l2.val + sum;
            sum = ans / 10;
            ans = ans % 10;

            dummy.next = new ListNode(ans);
            dummy = dummy.next;

            l2 = l2.next;
        }
        if (sum > 0) {
            dummy.next = new ListNode(sum);
        }

        return head.next;
    }
}