https://leetcode.com/problems/minimum-prefix-removal-to-make-array-strictly-increasing/description/

// Time Complexity: O(N) Space Complexity: O(1)
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int idx=-1;

        for (int i=0; i<n-1; i++) {
            if (nums[i]>=nums[i+1]) {
                idx=i;
            }
        }

        if (idx==-1) return 0;
        return idx+1;
    }
}