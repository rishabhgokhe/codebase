https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/

// Time Complexity: O(n log n) due to sorting Space Complexity: O(1)
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxSum=0;

        for (int i=0; i<n/2; i++) {
            maxSum = Math.max(nums[i]+nums[n-1-i], maxSum);
        }

        return maxSum;
    }
}