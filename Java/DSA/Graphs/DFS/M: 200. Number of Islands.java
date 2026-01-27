https://leetcode.com/problems/number-of-islands/

// Time Complexity: O(N*M) Space Complexity: O(N*M)
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int island = 0;

        boolean[][] vis = new boolean[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j]=='1' && !vis[i][j]) {
                    dfs(i, j, vis, grid, n, m);
                    island++;
                }
            }
        }

        return island;
    }

    private void dfs(int i, int j, boolean[][] vis, char[][] grid, int n, int m) {
        if (i<0 || j<0 || i>=n || j>=m || vis[i][j] || grid[i][j]=='0') return;

        vis[i][j] = true;

        dfs(i-1, j, vis, grid, n, m);
        dfs(i, j+1, vis, grid, n, m);
        dfs(i, j-1, vis, grid, n, m);
        dfs(i+1, j, vis, grid, n, m);

    }
}