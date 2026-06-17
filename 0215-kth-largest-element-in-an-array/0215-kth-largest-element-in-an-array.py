import heapq
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        myheap = []
        for num in nums:
            heapq.heappush_max(myheap,num)
        
        for i in range(k-1):
            heapq.heappop_max(myheap)
        return heapq.heappop_max(myheap)
        