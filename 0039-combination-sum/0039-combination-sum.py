class Solution:
    def generateCombi(self,candidates,target,curr,idx,currsum,res):
        if currsum==target:
            res.append(list(curr))
            return
        if idx==len(candidates) or currsum>target:
            return 
        
        curr.append(candidates[idx])
        currsum+=candidates[idx]
        self.generateCombi(candidates,target,curr,idx,currsum,res)

        currsum=currsum-curr[len(curr)-1]
        curr.pop()
        self.generateCombi(candidates,target,curr,idx+1,currsum,res)



    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res=[]
        curr=[]
        currsum=0
        self.generateCombi(candidates,target,curr,0,currsum,res)
        return res

        