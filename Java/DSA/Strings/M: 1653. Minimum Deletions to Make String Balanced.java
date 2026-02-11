https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/description/

// Time Complexity: O(n) Space Complexity: O(1)

class Solution {
    public int minimumDeletions(String s) {
        int bCount=0;
        int ans=0;

        for (char c: s.toCharArray()) {
            if (c=='b') bCount++;
            else {
                ans=Math.min(ans+1, bCount);
            }
        }

        return ans;
        
    }
}