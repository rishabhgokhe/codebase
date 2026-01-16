https://leetcode.com/problems/maximize-area-of-square-hole-in-grid/

// Time Complexity: O(NlogN + MlogM) Space Complexity: O(1)
import java.util.*;

class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int count = 1;
        int maxHGap = 0;

        if (hBars.length == 1) maxHGap = 2; 
        // for hBars
        for (int i=1; i<hBars.length; i++) {
            if (hBars[i]-hBars[i-1]==1) {
                count++;
            } else {
                count = 1;
            }
            maxHGap = Math.max(maxHGap, count+1);
        }

        int maxVGap = 0;
        count = 1;
        // for vBars
        if (vBars.length == 1) maxVGap = 2;
        for (int i=1; i<vBars.length; i++) {
            if (vBars[i]-vBars[i-1]==1) {
                count++;
            } else {
                count =1;
            }
            maxVGap = Math.max(maxVGap, count+1);
        }
        
        int side = Math.min(maxVGap, maxHGap);
        return side*side;

    }
}

// Explanation:
// 1. We Sort both the horizontal and vertical bars arrays.
// 2. Initialise variables to keep track of maximum gaps and a count variable. (count, maxHGap, maxVGap)
// 3. We atleast have one element in each vBars and hBars, so we check if the length is 1, then the maximum gap will be 2.
// 4. We iterate through the hBars array and check if the difference between the current and previous bar is 1, we increment the count. If not, we reset the count to 1. (here count store the number of consecutive bars with a gap of 1)
// 5. We update the maxHGap with the maximum value between the current maxHGap and count + 1 (to account for the gap).
// 6. We repeat the same process for the vBars array to find the maxVGap.
// 7. Finally, we calculate the side of the square hole as the minimum of maxHGap and maxVGap, and return the area by squaring the side.