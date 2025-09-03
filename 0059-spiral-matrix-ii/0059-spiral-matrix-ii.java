class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] res=new int[n][n];
        int total_ele=n*n;
        int r_start=0,r_end=n-1;
        int c_start=0,c_end=n-1;
        int ele=1;
        while(ele<=n*n)
        {
            for(int i=c_start; i<=c_end; i++)
            {
                res[r_start][i]=ele++;
                
            }
            r_start++;
            for(int i=r_start; i<=r_end; i++)
            {
                res[i][c_end]=ele++;
               
            }
            c_end--;
            for(int i=c_end; i>=c_start; i--)
            {
                res[r_end][i]=ele++;
                
            }
            r_end--;
            for(int i=r_end; i>=r_start; i--)
            {
                res[i][c_start]=ele++;
               
            }
            c_start++;
        }
        return res;
    }
}