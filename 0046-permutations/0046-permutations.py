class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        freq={}
        curr=[]
        def allPer(curr,freq,ans,nums):
            if len(curr)==len(nums):
                ans.append(list(curr))
                return
            for i in range(len(nums)):
                if freq.get(i,0)==0:
                    curr.append(nums[i])
                    freq[i]=1
                    allPer(curr,freq,ans,nums)
                    curr.pop()
                    freq[i]=0
        allPer(curr,freq,ans,nums)
        return ans


        