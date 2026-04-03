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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head;
        ListNode prev= dummy;
        for(int i=0;i<left-1;i++)
        {
            prev=prev.next;
            curr=curr.next;
        }
        ListNode prevnull=null;
        ListNode subcurr=curr;
        for(int j=0;j<right-left+1;j++)
        {
            ListNode next=curr.next;
            curr.next=prevnull;
            prevnull=curr;
            curr=next;

        }
       
        prev.next=prevnull;
        subcurr.next=curr;

        return dummy.next;

    }
}