class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>rset=new HashSet<>();
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if(matrix[i][j]==0) 
                {
                    rset.add(i);
                    set.add(j);
                }
            }
        }
       for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if(rset.contains(i)||set.contains(j)) 
                {
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}