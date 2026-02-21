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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return new int[] {-1, -1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        int position = 2;

        int firstCritical = -1;
        int lastCritical = -1;
        int minDistance = Integer.MAX_VALUE;

        while (curr.next != null) {

            boolean isCritical =
                (curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val);

            if (isCritical) {
                if (firstCritical == -1) {
                    firstCritical = position;
                }
                
                else {
                    minDistance = Math.min(minDistance, position - lastCritical);
                }

                lastCritical = position;
            }

            prev = curr;
            curr = curr.next;
            position++;
        }

        if (firstCritical == -1 || firstCritical == lastCritical) {
            return new int[] {-1, -1};
        }

        return new int[] {minDistance, lastCritical - firstCritical};
    }
}
