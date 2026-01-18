https://leetcode.com/problems/largest-even-number/description/

// Time Complexity: O(N) Space Complexity: O(1)
class Solution {
    public String largestEven(String s) {

        int lastTwo = -1;

        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == '2') {
                lastTwo = i;
                break;
            }
        }

        if (lastTwo == -1) return "";
        return s.substring(0, lastTwo+1);
        
    }
}