class Solution {
    int cnt=0;
   
   
    int[] goUp(int[][] mat ,int posR,int posC,int[] res)
    {
       int row = posR, col = posC;
        int rlen = mat.length;
        int clen = mat[0].length;

        while (row >= 0 && col < clen) {
           res[cnt++]=mat[row][col];
           
            row--;
            col++;
        }
         return new int[]{row + 1, col - 1};
    }

    int[] goDown(int[][]mat ,int posR,int posC,int[] res)
    {
       int row = posR, col = posC;
        int rlen = mat.length;
        int clen = mat[0].length;

        while (col >= 0 && row < rlen) {
            res[cnt++]=mat[row][col];
            row++;
            col--;
        }
        return new int[]{row - 1, col + 1};
    }
    public int[] findDiagonalOrder(int[][] mat) {
        int rlen=mat.length;
        int clen=mat[0].length;
        int[] res=new int[rlen*clen];
        int total=rlen*clen;
        int currR=0,currC=0;

        while(cnt<=total)
        {
            int[] arr1=goUp(mat,currR,currC,res);
           currR=arr1[0];
           currC=arr1[1];
           if (currC + 1 < clen)
                currC++;
            else
                currR++;

            if (cnt >= total) break;
            int[] arr2 = goDown(mat, currR, currC, res);
            currR = arr2[0];
            currC = arr2[1];

            if (currR + 1 < rlen)
                currR++;
            else
                currC++;

            
        }

        return res;
    }
}