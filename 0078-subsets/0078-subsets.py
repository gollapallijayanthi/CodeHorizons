class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[]
        for i in range(pow(2,len(nums))):
            curr=[]
            num=1
            idx=0
            while idx<len(nums):
                if num&i>0:
                    curr.append(nums[idx])
                num=num<<1
                idx=idx+1
            res.append(list(curr))
        return res
        