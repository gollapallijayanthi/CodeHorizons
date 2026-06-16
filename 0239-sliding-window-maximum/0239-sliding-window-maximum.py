import heapq
class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        myheap = []
        ans = []
        for i in range(0,k):
            heapq.heappush(myheap,(nums[i]*-1,i))
        ans.append(-myheap[0][0])
        
        for i in range(k,len(nums)):
            heapq.heappush(myheap,(-nums[i],i))

            while myheap and myheap[0][1] <= i-k:
                heapq.heappop(myheap)
            ans.append(-myheap[0][0])
        return ans
        