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
        if(head == null || head.next == null) return head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        k=k%count;
         if(k==0) return head;
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
        while(first.next!=null)
        {
            first=first.next;
        }
        first.next=head;
        return dummy.next;

        
    }
}