# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
       
        
        res = ListNode(0)
        temp_ans = res
        temp1 = l1
        temp2 = l2
        curr_sum = 0
        carry = 0

        while temp1 != None and temp2 != None :
            curr_sum = (temp1.val + temp2.val) + carry
            carry = curr_sum//10
            new_node = ListNode(curr_sum%10)
            temp_ans.next = new_node
            temp_ans = new_node

            
            temp1 = temp1.next
            temp2 = temp2.next
        
        while temp1 != None:
            curr_sum = (temp1.val ) + carry
            carry = curr_sum//10
            new_node = ListNode(curr_sum%10)
            temp_ans.next = new_node
            temp_ans = new_node
            
            temp1 = temp1.next
            
        while temp2 != None:
            curr_sum = (temp2.val ) + carry
            carry = curr_sum//10
            new_node = ListNode(curr_sum%10)
            temp_ans.next = new_node
            temp_ans = new_node
            temp2 = temp2.next
        
        if carry:
            temp_ans.next = ListNode(carry)


        res = res.next
        return res


        
        