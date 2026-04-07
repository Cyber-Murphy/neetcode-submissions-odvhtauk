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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode dummy=new ListNode(0);
       
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        dummy.next=slow.next;
        slow.next=null;
        //now reverse the 2nd half
        ListNode temp=dummy.next;
        while(temp!=null)
        {
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            
        }
        //now i have to connect the alternate nodes right

        ListNode temp1=head;
        ListNode temp2=prev;
        
        while(temp1!=null && temp2!=null)
        {
            //i need to store that 
            ListNode next1=temp1.next;
            ListNode next2=temp2.next;

            temp1.next=temp2;
            if(next1==null)
            {
                break;
            }
            temp2.next=next1;
            temp1=next1;
            temp2=next2;
        }
    }
}
