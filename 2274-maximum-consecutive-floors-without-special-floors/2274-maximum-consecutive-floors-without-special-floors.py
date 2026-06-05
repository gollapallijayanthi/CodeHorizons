class Solution:
    def maxConsecutive(self, bottom: int, top: int, special: List[int]) -> int:
        ans = 0
        c = 0
        list.sort(special)
        n = len(special)
        
        if bottom != special[0]:
            ans = special[0] - bottom
        
        for i in range(1, n ):
            if ans < (special[i] - special[i-1])-1:
                ans = (special[i] - special[i-1])-1
        
        if top != special[n-1] :
            ans = max(ans, top - special[n-1])

        return ans
            
            
        