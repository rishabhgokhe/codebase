https://leetcode.com/problems/find-the-largest-area-of-square-inside-two-rectangles/

// Time Complexity: O(N^2) Space Complexity: O(1)
class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int n = bottomLeft.length;
        int ans = 0;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int h = Math.min(topRight[i][1], topRight[j][1]) - Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                int w = Math.min(topRight[i][0], topRight[j][0]) - Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                
                if (h>0 && w>0) {
                    int minSide = Math.min(h,w);
                    ans = Math.max(ans, minSide);
                }
                
            }
        }

        return (long) ans*ans;
    }
}

// Explanation:
// 1. The Question demands for the maximum area of a square we can fit between any two rectangles.
// 2. Forget about the question and just simply consider two rectangles with bottonLeft = [(x1, y1), (x3, y3)] and topRight = [(x2, y2), (x4, y4)].
// 3. Now we calculate the intersecting heighs and widths of these two rectangles.
// 4. The formula can be more understanable with diagramtic representation.
// 5. height = min(y2, y4) - max(y1, y3)
// 6. width = min(x2, x4) - max(x1, x3)
// 7. If both height and width are positive, then we can fit a square inside these two rectangles. we take the minimum of them.
// 8. now we use the math max function on ans and store the maximum side length of the square we can fit.
// 9. Finally we return the area of the square by squaring the side length in the long type.