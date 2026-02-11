https://leetcode.com/problems/minimum-cost-to-convert-string-i/

// Time Complexity: O(26^3 + N) where N is the length of source string
class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int[][] sPath = new int[26][26];
        long minCost=0;

        for (int i=0; i<26; i++) {
            for (int j=0; j<26; j++) {
                if (i==j) sPath[i][j]=0;
                else sPath[i][j]=Integer.MAX_VALUE;
            }
        }

        for (int i=0; i<original.length; i++) {
            sPath[original[i]-'a'][changed[i]-'a'] = Math.min(cost[i], sPath[original[i]-'a'][changed[i]-'a']);
        }

        for (int k=0; k<26; k++) {
            for (int i=0; i<26; i++) {
                for (int j=0; j<26; j++) {
                      if (sPath[i][k] != Integer.MAX_VALUE && sPath[k][j] != Integer.MAX_VALUE && sPath[i][k]+sPath[k][j] < sPath[i][j]) {
                        sPath[i][j]=sPath[i][k]+sPath[k][j];
                      }
                }
            }
        }

       for (int i = 0; i < source.length(); i++) {
        char orgC = source.charAt(i);
        char chaC = target.charAt(i);
        if (sPath[orgC - 'a'][chaC - 'a'] == Integer.MAX_VALUE) return -1;
        
        minCost += sPath[orgC - 'a'][chaC - 'a'];
        }

        return minCost;

    }
}