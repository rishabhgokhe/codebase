https://leetcode.com/problems/minimum-cost-path-with-teleportations/

// Time Complexity : O(N*M*K) where N and M are the dimensions of the grid and K is the number of teleportations. Space Complexity : O(N*M)
class Solution {
    public int minCost(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int maxVal=0;
        for (int[] row: grid) {
            for (int val: row) {
                maxVal = Math.max(maxVal, val);
            }
        }

        int[][] dp = new int[n][m];
        int[] bestVal = new int[maxVal+1];
        int[] preSum = new int[maxVal+1];

        Arrays.fill(bestVal, Integer.MAX_VALUE);
        bestVal[grid[n-1][m-1]]=0;

        for (int i=n-1; i>=0; i--) {
            for (int j=m-1; j>=0; j--) {
                if (i==n-1 && j==m-1) continue;

                int d=i+1<n ? dp[i+1][j]+grid[i+1][j] :Integer.MAX_VALUE;
                int r=j+1<m ? dp[i][j+1]+grid[i][j+1] :Integer.MAX_VALUE;
                dp[i][j]=Math.min(d,r);
                bestVal[grid[i][j]] = Math.min(bestVal[grid[i][j]], dp[i][j]);
            }
        }

        for (int x=0; x<k; x++) {
            preSum[0]=bestVal[0];
            for (int val=1; val<=maxVal; val++) {
                preSum[val] = Math.min(preSum[val-1], bestVal[val]);
            }

            for (int i=n-1; i>=0; i--) {
                for (int j=m-1; j>=0; j--) {
                    if (i==n-1 && j==m-1) continue;

                    int walk= Math.min(i+1<n ? dp[i+1][j]+grid[i+1][j]: Integer.MAX_VALUE, j+1<m ? dp[i][j+1]+grid[i][j+1]: Integer.MAX_VALUE);

                    dp[i][j]=Math.min(walk, preSum[grid[i][j]]);
                    bestVal[grid[i][j]]=Math.min(bestVal[grid[i][j]], dp[i][j]);
                }
            }
        }

        return dp[0][0];
    }
}

