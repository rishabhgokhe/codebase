https://leetcode.com/problems/vowel-consonant-score/

// Time Complexity: O(N) Space Complexity: O(1)
class Solution {
    public int vowelConsonantScore(String s) {
        int vCount=0;
        int cCount=0;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                vCount++;
            } else if (!(Character.isDigit(c) || Character.isWhitespace(c))) {
                cCount++;
            }
        }
        if (cCount==0) return 0;
        return vCount/cCount;
    }
}