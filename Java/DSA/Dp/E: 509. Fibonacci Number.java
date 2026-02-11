https://leetcode.com/problems/fibonacci-number/description/

// Time Complexity: O(n) Space Complexity: O(n)
class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return calFib(dp, n);
    }

    int calFib(int[] dp, int n) {
        if (n<=1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = calFib(dp, n-1)+calFib(dp, n-2);
    }
}