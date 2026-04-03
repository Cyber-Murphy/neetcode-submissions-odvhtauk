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

        ListNode temp=head;
        int count=0;
        
        while(temp !=null )
        {
            temp=temp.next;
            count++;
        }
         if(count == n) {
            return head.next;
        }
        int res= count-n-1;
        temp=head;
        while(res>0)
        {
            temp=temp.next;
            res--;
        }
        temp.next=temp.next.next;
        return head;
    }
}
