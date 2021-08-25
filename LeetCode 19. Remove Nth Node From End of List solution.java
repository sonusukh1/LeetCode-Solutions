// LeetCode 19. Remove Nth Node From End of List solution in Java.

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head; // initialising two new pointer slow and fast pointing head;

        ListNode slow=head;

        for(int i=0;i<n;i++)  // shifting fast pointer one step ahead n times, to maintain diff of n nodes between slow and fast pointer.

        {
            
           fast=fast.next;
       
 }
        
if(fast==null)
            return head.next;  // checking if fast ==null we return head of next;
        while(fast.next!=null)
        {
            fast=fast.next;     // moving slow pointer to Nth node to be deleted and fast pointer to end of list;
        slow=slow.next;
        }
        slow.next=slow.next.next; // Setting up current node next to next of next node, which removes the desired node.
        
       return head;       //returning head.

    }
}