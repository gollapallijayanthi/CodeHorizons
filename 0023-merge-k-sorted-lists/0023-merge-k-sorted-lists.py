# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import heapq
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        myheap = []
        c = 0
        for l in lists:
            
            while l:
                heapq.heappush(myheap,(l.val,c,l))
                l = l.next
                c += 1
        
        newhead= ListNode(0)
        temp = newhead
        while myheap:
            val,i,newNode = heapq.heappop(myheap)
            
            temp.next = newNode
            temp = newNode
        temp = None
        
        return newhead.next


        