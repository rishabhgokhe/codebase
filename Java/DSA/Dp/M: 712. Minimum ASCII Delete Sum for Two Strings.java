https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/


// Time Complexity: O(m*n) Space Complexity: O(m*n)
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        dp[0][0] = 0;
        for (int i=1; i<=l1; i++) {
            dp[i][0] = s1.charAt(i-1)+dp[i-1][0];
        }
        for (int i=1; i<=l2; i++) {
            dp[0][i] = s2.charAt(i-1)+dp[0][i-1];
        }

        for (int i=1; i<=l1; i++) {
            for (int j=1; j<=l2; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i][j-1]+s2.charAt(j-1), dp[i-1][j]+s1.charAt(i-1));
                }
            }
        }

        return dp[l1][l2];
    }
}