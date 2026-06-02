class Solution:
    def findSubsets(self,nums,idx,ans,curr):
        if idx == len(nums):
            temp=sorted(curr)
            if temp not in ans:
                ans.append(list(temp))
            return 
        
        curr.append(nums[idx])
        self.findSubsets(nums,idx+1,ans,curr)

        curr.pop()
        self.findSubsets(nums,idx+1,ans,curr)


    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        curr=[]

        self.findSubsets(nums,0,ans,curr)
        return ans
        
        