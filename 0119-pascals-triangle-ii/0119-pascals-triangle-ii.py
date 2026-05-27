class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        ans=[]
       
        for i in range(rowIndex+1):
            temp=[]
            for j in range(i+1):
                if j==0:
                    temp.append(1)
                elif j==i:
                    temp.append(1)
                else:
                    temp.append(ans[i-1][j-1]+ans[i-1][j])
            ans.append(temp)
            if i==rowIndex:
                return temp