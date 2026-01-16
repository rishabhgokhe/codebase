https://leetcode.com/problems/separate-squares-i/description/

// Time Complexity : O(N log M) where N is the number of squares and M is the range of y-coordinates. Space Complexity : O(1)
class Solution {
    public double separateSquares(int[][] squares) {

        double low = 1e18, high = -1e18;
        double totalArea = 0;

        for (int[] s : squares) {
            low = Math.min(low, s[1]);
            high = Math.max(high, s[1] + s[2]);
            totalArea += (double) s[2] * s[2];
        }


        for (int i=0; i<60; i++) {
            double mid = (low + high) / 2;
            double below = areaBelow(squares, mid);

            if (below * 2 >= totalArea) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return low;
    }

    private double areaBelow(int[][] squares, double yLine) {
        double area = 0;

        for (int[] s : squares) {
            double y = s[1];
            double l = s[2];

            if (yLine <= y) {
                continue;
            } else if (yLine >= y + l) {
                area += l * l;
            } else {
                area += (yLine - y) * l;
            }
        }

        return area;
    }
}