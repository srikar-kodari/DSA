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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode prevA = null;
        ListNode afterB = null;
        ListNode curr = list1;
        int index = 0;

        while(curr != null) {
            if(index == a - 1) {
                prevA = curr;
            }
            if(index == b) {
                afterB = curr.next;
                break;
            }
            curr = curr.next;
            index++;
        }

        ListNode tail2 = list2;
        while(tail2.next != null) {
            tail2 = tail2.next;
        }

        prevA.next = list2;
        tail2.next = afterB;

        return list1;
    }
}