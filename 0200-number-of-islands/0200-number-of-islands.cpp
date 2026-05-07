class Solution {
public:

    bool isSafe(vector<vector<int>>& visited,
                vector<vector<char>>& grid,
                int row, int col, int n, int m) {

        if ((row >= 0 && row < n) &&
            (col >= 0 && col < m) &&
            visited[row][col] != 1 &&
            grid[row][col] == '1')
            return true;

        return false;
    }

    void dfs(vector<vector<char>>& grid,
             vector<vector<int>>& visited,
             int row, int col, int n, int m) {

        visited[row][col] = 1;

        vector<int> dr = {-1, 0, 0, 1};
        vector<int> dc = {0, -1, 1, 0};

        for (int i = 0; i < 4; i++) {

            int r = row + dr[i];
            int c = col + dc[i];

            if (isSafe(visited, grid, r, c, n, m)) {
                dfs(grid, visited, r, c, n, m);
            }
        }
    }

    int numIslands(vector<vector<char>>& grid) {

        int n = grid.size();
        int m = grid[0].size();

        vector<vector<int>> visited(n, vector<int>(m, 0));

        int islands = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {

                    dfs(grid, visited, i, j, n, m);

                    islands++;
                }
            }
        }

        return islands;
    }
};