class Solution:
    def limitOccurrences(self, nums: list[int], k: int) -> list[int]:
        ans=[]
        freq={}
        for n in nums:
            if freq.get(n,0)<k:
                ans.append(n)
                freq[n]=freq.get(n,0)+1
        return ans
        