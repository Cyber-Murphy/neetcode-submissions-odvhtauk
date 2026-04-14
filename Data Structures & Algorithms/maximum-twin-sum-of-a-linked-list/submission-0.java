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
    public int pairSum(ListNode head) {
        List<Integer> arr= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        int l=0;
        int r= arr.size()-1;
        int sum=0;
        while(l<=r)
        {
            sum=Math.max(sum, arr.get(l)+arr.get(r));
            l++;
            r--;
        }
        return sum;
    }
}