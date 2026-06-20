import heapq

class Solution:
    def nthUglyNumber(self, n: int) -> int:
        myheap = [1]
        seen = {1}
        ans = []

        while len(ans) < n:
            num = heapq.heappop(myheap)
            ans.append(num)

            for x in [2, 3, 5]:
                if num * x not in seen:
                    seen.add(num * x)
                    heapq.heappush(myheap, num * x)

        return ans[n - 1]