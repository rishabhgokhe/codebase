https://leetcode.com/problems/largest-rectangle-in-histogram/description/

// Time Complexity: O(N) Space Complexity: O(N)
import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<=n; i++) {
            int currH = (i==n) ? 0 : heights[i];
            
            while(!stack.isEmpty() && currH < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int w;
                
                if (stack.isEmpty()) {
                    w = i;
                } else {
                    w = i-stack.peek()-1;
                }

                maxArea = Math.max(maxArea, h*w);
            }

            stack.push(i);
        }

        return maxArea;

    }
}