/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null) return null;

        Map<ListNode, Integer> map = new HashMap<>();     // Map or Set for O(1) TC.

        ListNode temp = head;
        while(temp != null) {
            if(map.containsKey(temp)) return temp;

            else {
                map.put(temp, 1);
                temp = temp.next;
            }
        }

        return null;
    }
}