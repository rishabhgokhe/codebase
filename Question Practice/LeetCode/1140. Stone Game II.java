class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] memo = new int[n][n];
        int[] suffixSum = new int[n];
        
        // Compute the suffix sum array
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = piles[i] + suffixSum[i + 1];
        }
        
        return helper(piles, suffixSum, memo, 0, 1);
    }

    private int helper(int[] piles, int[] suffixSum, int[][] memo, int i, int M) {
        int n = piles.length;
        
        // Base case: if we've taken all piles
        if (i >= n) {
            return 0;
        }
        
        // If the remaining piles are less than or equal to what can be taken in one turn, take them all
        if (2 * M >= n - i) {
            return suffixSum[i];
        }
        
        // Check if result is already computed
        if (memo[i][M] != 0) {
            return memo[i][M];
        }
        
        int minStonesForBob = Integer.MAX_VALUE;
        
        // Try taking X piles, where 1 <= X <= 2 * M
        for (int X = 1; X <= 2 * M; X++) {
            // Minimize the stones Bob can take
            minStonesForBob = Math.min(minStonesForBob, helper(piles, suffixSum, memo, i + X, Math.max(M, X)));
        }
        
        // Alice's stones = all remaining stones - the minimum stones Bob can take
        memo[i][M] = suffixSum[i] - minStonesForBob;
        return memo[i][M];
    }
}

// view question description - https://leetcode.com/problems/stone-game-ii/