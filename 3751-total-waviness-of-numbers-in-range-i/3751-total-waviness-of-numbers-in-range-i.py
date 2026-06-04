class Solution:
    def countwaveness(self,num):
        s=str(num)
        l=list(s)
        n=len(l)
        print(l)
        i=1
        c=0
        while i<n-1:
            if int(l[i])>int(l[i-1]) and int(l[i])>int(l[i+1]):
                c+=1
            if int(l[i])<int(l[i-1]) and int(l[i])<int(l[i+1]):
                c+=1
            i+=1
        return c

        
    def totalWaviness(self, num1: int, num2: int) -> int:
        ans=0
        for i in range(num1,num2+1):
            ans+=self.countwaveness(i)
        return ans
        