
class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length; // number of rows
        int n = points[0].length; // number of columns

        // dp array to store the maximum points we can achieve up to each cell
        long[] dp = new long[n];

        // Initialize dp with the points of the first row
        for (int j = 0; j < n; j++) {
            dp[j] = points[0][j];
        }

        // Iterate over each row starting from the second row
        for (int i = 1; i < m; i++) {
            long[] leftToRight = new long[n]; // Temporary array for left to right pass
            long[] rightToLeft = new long[n]; // Temporary array for right to left pass

            // Left to right pass
            leftToRight[0] = dp[0]; // First column
            for (int j = 1; j < n; j++) {
                leftToRight[j] = Math.max(leftToRight[j - 1] - 1, dp[j]);
            }

            // Right to left pass
            rightToLeft[n - 1] = dp[n - 1]; // Last column
            for (int j = n - 2; j >= 0; j--) {
                rightToLeft[j] = Math.max(rightToLeft[j + 1] - 1, dp[j]);
            }

            // Update dp for the next row
            for (int j = 0; j < n; j++) {
                dp[j] = points[i][j] + Math.max(leftToRight[j], rightToLeft[j]);
            }
        }

        // The answer will be the maximum value in the dp array after processing all rows
        long result = 0;
        for (long val : dp) {
            result = Math.max(result, val);
        }

        return result;
    }
}

// view question description - https://leetcode.com/problems/maximum-number-of-points-with-cost/