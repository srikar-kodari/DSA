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
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] result = new ListNode[k];

        ListNode temp = head;
        int counter = 0;
        while(temp != null) {
            counter++;
            temp = temp.next;
        }

        int noOfElements = counter / k;
        int remaining = counter % k;

        temp = head;
        for(int i=0; i<k; i++) {

            result[i] = temp;

            int size = noOfElements + (remaining-- > 0 ? 1 : 0);

            for(int j=1; j < size && temp != null; j++) {

                temp = temp.next;
            }

            if(temp != null) {

                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }

        return result;
    }
}