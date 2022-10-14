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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null)
            return head;
        if(head.next == null)
        {
            return null;
        }
        
        int n = count(head);
        int iterator = 0;
        ListNode head_copied = head;
        int mid = n/2;
        while(iterator < mid - 1)
        {
            head = head.next;
            iterator++;
        }
        
        head.next = head.next.next;
        
        return head_copied;
        
    }
    
    public int count(ListNode head)
    {
        ListNode temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}