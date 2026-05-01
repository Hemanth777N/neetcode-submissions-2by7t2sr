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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stk.push(temp.val);
            temp = temp.next;
        }
        ListNode temp1 = head;
        while(temp1 != null){
            temp1.val = stk.pop();
            temp1 = temp1.next;
        }
        return head;
        
    }
}
