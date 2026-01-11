https://leetcode.com/problems/maximum-fruits-harvested-after-at-most-k-steps/


// Time Complexity: O(N) Space Complexity: O(1)
class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int left=0, sum=0, ans=0;

        for (int right=0; right<n; right++) {
            sum += fruits[right][1];
            while ( left<=right && !validPos(fruits, left, right, startPos, k)) {
                sum -= fruits[left][1];
                left++;
            }

            ans = Math.max(ans, sum);
        }

        return ans;

    }

    private boolean validPos(int[][] fruits, int l, int r, int start, int k) {
        int leftPos = fruits[l][0];
        int rightPos = fruits[r][0];

        if (start <= leftPos) {
            return rightPos - start <= k;
        }

        if (rightPos <= start) {
            return start - leftPos <= k;
        }

        return (Math.min(2* Math.abs(start-leftPos) + Math.abs(rightPos-start), 2* Math.abs(rightPos-start) + Math.abs(start-leftPos))) <=k;
    }
}