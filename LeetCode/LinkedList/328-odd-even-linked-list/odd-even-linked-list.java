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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) return head;

        List<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        List<Integer> result = new ArrayList<>();
        int n = list.size();

        for(int i=0; i<n; i+=2) {
            result.add(list.get(i));
        }
        for(int i=1; i<n; i+=2) {
            result.add(list.get(i));
        }

        temp = head;
        int i = 0;
        while(temp != null) {
            temp.val = result.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}
