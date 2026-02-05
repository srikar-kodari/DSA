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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || head.next == null || k == 1) return head;

        ListNode temp = head;
        ListNode prev = null;
        while(temp != null) {
            ListNode kthNode = findKthNode(temp, k);

            if(kthNode == null) {

                if(prev != null) prev.next = temp;
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            recursiveReverseLL(temp);

            if(temp == head) {
                head = kthNode;
            }
            else {
                prev.next = kthNode;
            }

            prev = temp;
            temp = nextNode;
        }
        return head;
    }

    public static ListNode findKthNode(ListNode temp, int k) {

        k -= 1;
        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

    public static ListNode recursiveReverseLL(ListNode head) {  // Recursive Approach. TC: O(N), SC: O(N)

        if(head == null || head.next == null) return head;

        ListNode newHead = recursiveReverseLL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }
    
}