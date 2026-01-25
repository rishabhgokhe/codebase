https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/description/

// Time Complexity: O(m * n * min(m, n)) Space Complexity: O(m * n)
class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] pre = new int[rows+1][cols+1];

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=cols; j++) {
                pre[i][j] = mat[i-1][j-1]
                          + pre[i-1][j]
                          + pre[i][j-1]
                          - pre[i-1][j-1];
            }
        }

        int maxSide = 0;

        for (int size=1; size<=Math.min(rows, cols); size++) {
            boolean found = false;

            for (int i=size; i<=rows; i++) {
                for (int j=size; j<=cols; j++) {

                    int sum = pre[i][j]
                            - pre[i-size][j]
                            - pre[i][j-size]
                            + pre[i-size][j-size];

                    if (sum<=threshold) {
                        maxSide = size;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (!found) break;
        }

        return maxSide;
    }
}