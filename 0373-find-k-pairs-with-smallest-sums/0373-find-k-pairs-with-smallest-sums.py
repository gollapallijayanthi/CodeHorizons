import heapq

class Solution:
    def kSmallestPairs(self, nums1: List[int], nums2: List[int], k: int) -> List[List[int]]:
        myheap = []

        for i in range(len(nums1)):
            for j in range(len(nums2)):
                if len(myheap) == k and -(nums1[i] + nums2[j]) <= myheap[0][0]:
                    break

                heapq.heappush(myheap, (-(nums1[i] + nums2[j]), nums1[i], nums2[j]))

                if len(myheap) > k:
                    heapq.heappop(myheap)

        ans = []

        while myheap:
            _, a, b = heapq.heappop(myheap)
            ans.append([a, b])

        return ans[::-1]