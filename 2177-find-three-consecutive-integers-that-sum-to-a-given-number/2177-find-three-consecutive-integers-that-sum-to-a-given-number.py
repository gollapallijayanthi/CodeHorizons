class Solution:
    def sumOfThree(self, num: int) -> List[int]:
        #x+(x+1)+(x+2)=num --> 3x+3=num-->3(x+1)=num--->x=(num/3)+1
        k=num//3
        if k>=0 and num%3==0:
            return [k-1,k,k+1]
        else:
            return []
        