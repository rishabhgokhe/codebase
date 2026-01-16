https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

// Time Complexity: O(N^2) Space Complexity: O(1)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (nums[j] < nums[i]) {
                    ans[i]++;
                }
            }
        }

        return ans;
    }
}