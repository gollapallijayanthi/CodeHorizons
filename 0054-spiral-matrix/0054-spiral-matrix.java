class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int r_start=0,r_end=matrix.length-1;
        int c_start=0,c_end=matrix[0].length-1;
        int cnt=0;
        while(res.size()<m*n)
        {
            for(int i=c_start; i<=c_end&& res.size() < m * n; i++)
            {
                res.add(matrix[r_start][i]);
                

            }
            r_start++;
            for(int i=r_start; i<=r_end&& res.size() < m * n; i++)
            {
                res.add(matrix[i][c_end]);
                

            }
            c_end--;
            for(int i=c_end; i>=c_start&& res.size() < m * n; i--)
            {
                res.add(matrix[r_end][i]);
               
            }
            r_end--;
            for(int i=r_end; i>=r_start&& res.size() < m * n; i--)
            {
                res.add(matrix[i][c_start]);
               
            }

            c_start++;
            
        }
        return res;
    }
}