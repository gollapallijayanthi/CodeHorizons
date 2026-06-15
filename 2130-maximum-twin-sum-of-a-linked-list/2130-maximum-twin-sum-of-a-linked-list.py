# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        fast = head
        slow = head
        
        
        while fast and fast.next:
            
            fast = fast.next.next
            slow = slow.next
        
        newList = None
        curr = slow
        while curr :
            newNode = curr.next
            curr.next = newList
            newList = curr
            curr = newNode
        
        temp1 = head
        temp2 = newList
        ans = 0
        while temp1 and temp2:
            ans = max(ans,temp1.val+temp2.val)
            temp1 = temp1.next
            temp2 = temp2.next
        return ans

        