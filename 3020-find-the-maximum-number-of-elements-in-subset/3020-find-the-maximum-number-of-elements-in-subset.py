class Solution:
    def maximumLength(self, nums: List[int]) -> int:
        d={}
        for num in nums:
            if d.get(num,0) == 0:
                d[num] = 1
            else:
                d[num] +=1
        
        ans=1
        lst = sorted(d.keys(), key=lambda x: x)
        if 1 in lst:
            if d[1] % 2 ==0:
                ans = d[1] -1
            else:
                ans = d[1]
            lst.remove(1)
        
        for num in lst:
            val = num
            if d.get(val,0) > 1:
                c = 1
                while d.get(val*val,0) >1:
                    c += 1
                    val = val *val
                if d.get(val*val,0) >=1:
                    c+=1 


                ans = max(ans,((c-1)*2)+1)
        return ans
        
                
            



        