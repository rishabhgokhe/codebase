https://leetcode.com/problems/transformed-array/description/

// Time Complexity: O(n) Space Complexity: O(n)
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];

        for (int i=0; i<n; i++) {
            int idx = ((i + nums[i]) % n + n) % n;
            res[i] = nums[idx];
        }

        return res;
    }
}