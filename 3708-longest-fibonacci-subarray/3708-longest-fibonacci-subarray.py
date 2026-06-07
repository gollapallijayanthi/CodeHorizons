class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        res = 0
        curr = 1
        if len(nums) <= 2:
            return len(nums)
        for i in range(len(nums)-2):
            if nums[i] + nums[i+1] == nums[i+2]:
                curr += 1
                
            else:
                res = max(res, curr+1)
                curr = 1
        res = max(res, curr+1)
        return res


        