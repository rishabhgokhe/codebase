https://leetcode.com/problems/largest-magic-square/description/

// Time Complexity : O(N^2 * M^2) Space Complexity : O(N * M)
class Solution {
    public int largestMagicSquare(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] rowPre = new int[rows][cols];
        int[][] colPre = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            rowPre[r][0] = grid[r][0];
            for (int c = 1; c < cols; c++) {
                rowPre[r][c] = rowPre[r][c - 1] + grid[r][c];
            }
        }

        for (int c = 0; c < cols; c++) {
            colPre[0][c] = grid[0][c];
            for (int r = 1; r < rows; r++) {
                colPre[r][c] = colPre[r - 1][c] + grid[r][c];
            }
        }

        int maxSize = 1;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int maxPoss = Math.min(rows - r, cols - c);

                for (int size = maxPoss; size > maxSize; size--) {
                    if (isValid(r, c, size, grid, rowPre, colPre)) {
                        maxSize = size;
                        break;
                    }
                }
            }
        }
        return maxSize;
    }

    private boolean isValid(int sr, int sc, int size,
                            int[][] grid, int[][] rowPre, int[][] colPre) {

        int target = rowPre[sr][sc + size - 1]
                   - (sc > 0 ? rowPre[sr][sc - 1] : 0);

        for (int r = sr; r < sr + size; r++) {
            int sum = rowPre[r][sc + size - 1]
                    - (sc > 0 ? rowPre[r][sc - 1] : 0);
            if (sum != target) return false;
        }

        for (int c = sc; c < sc + size; c++) {
            int sum = colPre[sr + size - 1][c]
                    - (sr > 0 ? colPre[sr - 1][c] : 0);
            if (sum != target) return false;
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < size; i++) {
            d1 += grid[sr + i][sc + i];
            d2 += grid[sr + size - 1 - i][sc + i];
        }

        return d1 == target && d2 == target;
    }
}