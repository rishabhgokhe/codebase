https://leetcode.com/problems/count-residue-prefixes/

// Time Complexity: O(N) Space Complexity: O(1)
class Solution {
    public int residuePrefixes(String s) {
        boolean[] freq = new boolean[26];
        int dist = 0;
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            
            if (!freq[idx]) {
                freq[idx] = true;
                dist++;
            }

            if (dist == (i+1)%3) {
                count++;
            }
        }

        return count;
    }
}