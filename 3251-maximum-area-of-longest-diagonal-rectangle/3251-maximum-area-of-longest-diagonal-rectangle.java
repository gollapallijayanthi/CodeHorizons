class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
      int maxDiag = -1;
        int maxArea = -1;
        for(int i=0; i<dimensions.length; i++)
        {
            int l=dimensions[i][0];
            int b=dimensions[i][1];
         int diag = (l * l) + (b * b);  
            int area = l * b;
            if (diag > maxDiag) { 
                maxDiag = diag;
                maxArea = area;
            } else if (diag == maxDiag && area > maxArea) { 
                maxArea = area;
            }
        }
        return maxArea;
    }
}