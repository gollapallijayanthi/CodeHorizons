class Solution {
public:
    vector<vector<int>> onesMinusZeros(vector<vector<int>>& grid) {
        int m=grid.size();
        int n=grid[0].size();
        vector<int>rowsone(m);
        vector<int>colsone(n);
         vector<int>rowszero(m);
        vector<int>colszero(n);
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j]==1)
                {
                    rowsone[i]+=1;
                    colsone[j]+=1;
                }
                else
                {
                     rowszero[i]+=1;
                    colszero[j]+=1;

                }
            }
        }
        vector<vector<int>>res(m,vector<int>(n));
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                int diff=rowsone[i]+colsone[j]-rowszero[i]-colszero[j];
                res[i][j]=diff;
            }
        }
        return res;
    }
};