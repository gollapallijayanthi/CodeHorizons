class Solution:
    def sol(self,nums,res,curr,ind):
        if ind==len(nums):
            res.append(list(curr))
            return 
        
        curr.append(nums[ind])
        self.sol(nums,res,curr,ind+1)

        curr.pop()
        self.sol(nums,res,curr,ind+1)
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[]
        curr=[]
        self.sol(nums,res,curr,0)
        return res
        