class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        curr=[]
        freq=[0]*len(nums)
        def generatePermu(curr,nums,freq):
            if len(nums)==len(curr):
                if curr not in ans:
                    ans.append(list(curr))
                return
            
            for i in range(len(nums)):
                if freq[i]==0:
                    freq[i]=1
                    curr.append(nums[i])
                    generatePermu(curr,nums,freq)
                    curr.pop()
                    freq[i]=0
        generatePermu(curr,nums,freq)
        return ans

            
            
        