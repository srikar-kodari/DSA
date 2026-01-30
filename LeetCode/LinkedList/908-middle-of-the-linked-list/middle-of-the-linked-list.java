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
    public ListNode middleNode(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if(cnt == count/2) {
                break;
            }
            temp = temp.next;
        }
        
        return temp.next;
    }
}