class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rD={}
        cD={}
        Mat33B={}
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j]==".":
                    continue
                else:
                    num=int(board[i][j])

                if rD.get(i,[0])==[0]:
                    rD[i]=[0]*9
                    rD[i][num-1]=1
                else:
                    if rD[i][num-1]==1:
                        return False
                    else:
                        rD[i][num-1]=1
                        
                if cD.get(j,[0])==[0]:
                    cD[j]=[0]*9
                    cD[j][num-1]=1
                else:
                    if cD[j][num-1]==1:
                        return False
                    else:
                        cD[j][num-1]=1
                # separate Board 9x9 is divided into 3*3 borad like matBoard separate like 00,01,02in first row and 10,11,12 in second and so on..
                #we get the  matboard  indices like  00,01,02,... from actual board like (i//3)=l and j//3=m is the actual lm indices of matboard
                # again to store the matboard indices(l,m)= 01,02,03,10,11,12,..33 we use a simple formula like (l*1)+(m*3)=k we store the all numbers of board a list represening its occurence in the board mapperd to the l,m reperesented as a value k
                

                #compute
                l=i//3
                m=j//3
                k=(l*1)+(m*3)
                if Mat33B.get(k,[0])==[0]:
                    Mat33B[k]=[0]*9
                    Mat33B[k][num-1]=1
                else:
                    if Mat33B[k][num-1]==1:
                        return False
                    else:
                        Mat33B[k][num-1]=1
        return True
                


        