https://leetcode.com/problems/rotting-oranges/

// Time Complexity O(N*M) Space Complexity O(N*M)
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int ans=0;

        Queue<int[]> q = new LinkedList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j, 0});
                    vis[i][j]=true;
                }
            }
        }

        while (q.size()>0) {
            int[] pair = q.poll();
            int i=pair[0];
            int j=pair[1];
            int t=pair[2];

            ans = Math.max(ans, t);

            if (i-1>=0 && !vis[i-1][j] && grid[i-1][j]==1) {
                q.offer(new int[]{i-1, j, t+1});
                vis[i-1][j]=true;
            }

            if (j+1<m && !vis[i][j+1] && grid[i][j+1]==1) {
                q.offer(new int[]{i, j+1, t+1});
                vis[i][j+1]=true;
            }

            if (i+1<n && !vis[i+1][j] && grid[i+1][j]==1) {
                q.offer(new int[]{i+1, j, t+1});
                vis[i+1][j]=true;
            }

            if (j-1>=0 && !vis[i][j-1] && grid[i][j-1]==1) {
                q.offer(new int[]{i, j-1, t+1});
                vis[i][j-1]=true;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j]==1 && !vis[i][j]) return -1;
            }
        }

        return ans;

    }
}