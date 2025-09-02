/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       ListNode temp=node;
       ListNode curr=node;
       curr.val=temp.next.val;
       curr.next=temp.next.next;
       
    }
}