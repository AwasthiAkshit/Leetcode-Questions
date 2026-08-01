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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head = null;
        ListNode dummy = new ListNode(-1);
        if(l1.val<=l2.val) head = l1;
        else head = l2;
        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null&&l1.val<=l2.val){
                dummy.next = l1;
                l1 = l1.next;
                dummy = dummy.next;
            }
            else if(l1!=null&&l2!=null&&l1.val>=l2.val){
                dummy.next = l2;
                l2 = l2.next;
                dummy = dummy.next;
            }
            else if(l1==null){
                dummy.next = l2;
                l2 = l2.next;
                dummy = dummy.next;
            }
            else{
                dummy.next = l1;
                l1 = l1.next;
                dummy = dummy.next;
            }
        }
        return head;
    }
}