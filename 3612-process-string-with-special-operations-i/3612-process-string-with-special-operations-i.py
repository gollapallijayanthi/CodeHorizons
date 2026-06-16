class Solution:
    def processStr(self, s: str) -> str:
        ans = []

        for ch in s:
            if ch.isalpha():
                ans.append(ch)
            elif ch == '*' and len(ans)>0:
                ans.pop()
            elif ch == '#':
                ans.extend(ans)
            elif ch == '%':
                ans.reverse()
        
        res="".join(ans)
        return res
        