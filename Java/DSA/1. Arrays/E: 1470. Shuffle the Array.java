https://leetcode.com/problems/shuffle-the-array/description/

// Time complexity: O(n) Space complexity: O(n)
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        for (int i=0; i<n; i++) {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }

        return ans;
    }
}