// LeetCode 876. Middle of the Linked List in Java.

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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        int res=0;
     
        res=(count/2)+1;
        temp=head;
            if(count%2==0)
        {
                while(temp.next!=null && res>1)
        {
             res--;
            temp=temp.next;
           
        }
            }
        else
            {
            while(temp.next!=null && res>0)
        {
             res--;
            temp=temp.next;
           
        }
        }
        return temp;
        
    // Solution 2  optimize Approach. 
        
//         public ListNode middleNode(ListNode head) {
//         ListNode temp=head,temp2=head;
//     //int count=0;
//         while(temp2!=null && temp2.next!=null)
//         {
//            temp=temp.next;
//             temp2=temp2.next.next;
//         }
        
//         return temp;
    }
}