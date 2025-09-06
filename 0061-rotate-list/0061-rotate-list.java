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
        if(head==null||head.next==null) return head;
        ListNode temp=head;
        ListNode temp1=head;
         int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        
        k = k % length;
        if (k == 0) return head;
        int pos=k;
        while(temp!=null&&temp.next!=null)
        {
            temp=temp.next;
            pos-=1;
            if(pos==0) break;
        }


        while(temp.next!=null)
        {
            temp=temp.next;
            temp1=temp1.next;
        }

        System.out.println(temp.val+" "+temp1.val);
         ListNode head1=temp1.next;
         System.out.println(" "+head1.val);
        temp1.next=null;
        temp.next=head;
        return head1;
    }
}