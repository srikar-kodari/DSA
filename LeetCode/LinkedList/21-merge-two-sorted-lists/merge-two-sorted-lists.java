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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null) {

            if(temp1.val <= temp2.val) {
                tail.next = temp1;
                temp1 = temp1.next;
            }
            else {
                tail.next = temp2;
                temp2 = temp2.next;
            }
            tail = tail.next;
        }

        tail.next = (temp1 != null) ? temp1 : temp2;

        return dummy.next;
    }
}