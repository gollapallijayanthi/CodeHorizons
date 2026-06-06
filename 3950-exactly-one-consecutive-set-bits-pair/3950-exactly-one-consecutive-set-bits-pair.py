class Solution:
    def consecutiveSetBits(self, n: int) -> bool:
        num=1
        c=0
        cons=0
        while num<=n:
            if n&num != 0:
                
                c+=1
            else:
                if c>=2:
                    cons+=c-1
                c=0
            num=num<<1

        if c>=2:
            cons+=c-1
       
        if cons==1:
            return True
        else:
            return False
            
        