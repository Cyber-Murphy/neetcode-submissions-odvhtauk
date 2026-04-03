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
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    while(l1 != null){
        st1.push(l1.val);
        l1 = l1.next;
    }

    while(l2 != null){
        st2.push(l2.val);
        l2 = l2.next;
    }

    String s1 = "";
    String s2 = "";

    while(!st1.isEmpty()){
        s1 += st1.pop();
    }

    while(!st2.isEmpty()){
        s2 += st2.pop();
    }

    int num1 = Integer.parseInt(s1);
    int num2 = Integer.parseInt(s2);

    int sum = num1 + num2;

    String result = Integer.toString(sum);

    Stack<Integer> st3 = new Stack<>();

    for(char c : result.toCharArray()){
        st3.push(c - '0');
    }

    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;

    while(!st3.isEmpty()){
        curr.next = new ListNode(st3.pop());
        curr = curr.next;
    }

    return dummy.next;
}
}
