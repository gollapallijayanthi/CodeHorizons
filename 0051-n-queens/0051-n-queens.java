class Solution {
   
        
    static boolean isSafe(List<List<String>>board,int row,int col,int n)
    {
        int i,j;
        for( i=0; i<row; i++)
        {
            if(board.get(i).get(col).equals("Q")) return false;
        }
        for(i=row,j=col; i>=0&&j>=0; i--,j--)
        {
            if(board.get(i).get(j).equals("Q")) return false;

        }
        for(i=row,j=col; i>=0&&j<n; i--,j++)
        {
            if(board.get(i).get(j).equals("Q")) return false;
            
        }
        return true;

    }
    static void  solveQueens(List<List<String>>board,int row,int n,List<List<String>> solutions)
    {
         if (row == n) {
         List<String> copy = new ArrayList<>();
            for (List<String> r : board) {
                copy.add(String.join("", r));
            }
            solutions.add(copy);
            return;
    
            }
        for(int i=0; i<n; i++)
        {
            if(isSafe(board,row,i,n))
            {
                board.get(row).set(i,"Q");
               solveQueens(board,row+1,n,solutions);
               board.get(row).set(i, ".");

            }
        }
        
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>board=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            List<String>row=new ArrayList<>(Collections.nCopies(n,"."));
            board.add(row);
        }
      List<List<String>> solutions = new ArrayList<>();
        solveQueens(board, 0, n, solutions);
        return solutions;

    }
}