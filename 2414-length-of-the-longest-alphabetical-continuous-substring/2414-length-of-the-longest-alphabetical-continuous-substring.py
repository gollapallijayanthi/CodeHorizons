class Solution:
    def longestContinuousSubstring(self, s: str) -> int:
        ans=0
        c=1
        for i in range(1,len(s)):
            if abs(ord(s[i-1])-ord(s[i]))==1 and ord(s[i-1])<ord(s[i]):
                c+=1
            else:
                ans=max(ans,c)
                c=1
        ans=max(ans,c)
        return ans