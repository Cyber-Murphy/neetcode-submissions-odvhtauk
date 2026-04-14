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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        k=k%count;
        int pointer=count-k;temp=head;
        int curr=1;
        while(curr<pointer)
        {
            curr++;
            temp=temp.next;
        }
        ListNode dummy= new ListNode(0);
        dummy.next=temp.next;
        temp.next=null;
        ListNode first=dummy.next;
        while(first!=null)
        {
            first=first.next;
        }
        first.next=head;
        return dummy.next;

        
    }
}