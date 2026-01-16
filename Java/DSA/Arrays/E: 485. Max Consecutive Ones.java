https://leetcode.com/problems/max-consecutive-ones/description/

// Time complexity: O(n) Space complexity: O(1)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currLen=0, ans= Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                ans = Math.max(ans, currLen);
                currLen = 0;
            } else {
                currLen++;
            }
        }

        return Math.max(ans, currLen);
    }
}