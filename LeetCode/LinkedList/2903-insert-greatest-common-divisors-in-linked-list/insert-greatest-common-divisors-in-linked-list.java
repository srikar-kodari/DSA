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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if(head.next == null) return head;

        ListNode temp = head;
        ListNode front = null;
        while (temp.next != null) {

            int gcd = findGCD(temp.val, temp.next.val);

            front = temp.next;
            temp.next = new ListNode(gcd, front);
            temp = front;
        }

        return head;
    }

    public static int findGCD(int a, int b) {

        while(a != 0 && b != 0) {

            if(a > b) a = a % b;
            else b = b % a;
        }

        if(a == 0) return b;
        else return a;
    }

}