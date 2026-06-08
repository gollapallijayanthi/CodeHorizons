class Solution:
    def generateValidStrings(self, n: int, k: int) -> list[str]:
        ans = []
        
        for i in range(0,1<<n):
            bit =1
            s=""
            l=0
            c=0
            while l<n:
                if (bit&i) >= 1:
                    s = "1"+s
                    
                else:
                    s = "0"+s
                bit=bit<<1
                l+=1
            
            if "11" in s:
                continue
            else:
                for j in range(len(s)):
                    if s[j] == "1":
                        c += j
                if c <=k:
                    ans.append(s)
        return ans
                    
            
        