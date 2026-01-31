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
    public boolean isPalindrome(ListNode head) {

        if(head.next == null) return true;

        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;
        while(temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            int check = stack.pop();

            if(temp.val != check) return false;
            temp = temp.next;
        }

        return true;
    }
}
