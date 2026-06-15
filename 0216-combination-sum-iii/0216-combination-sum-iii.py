class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        res = []
        curr = []
        currSum = 0
        
        def generate_combi(curr,currSum,indx):
            if currSum == n  and len(curr) == k:
                res.append(list(curr))
                return 
            if currSum > n or indx == 10 or len(curr) >k:
                return
            
            for i in range(indx,10):
                if i >= indx :
                    currSum += i
                    curr.append(i)
                    generate_combi(curr,currSum,i+1)

                    currSum -= i
                    curr.pop()
        
        generate_combi(curr,currSum,1)

        return res
            

        
        