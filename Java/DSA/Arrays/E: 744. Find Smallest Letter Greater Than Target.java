https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

// Time complexity: O(n) Space complexity: O(1)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min=Integer.MAX_VALUE;
        for (int i=0; i<letters.length; i++) {
            if (letters[i]-target>0 && letters[i]-'a'<min)
            min = letters[i]-'a';
        }

        if (min==Integer.MAX_VALUE) return letters[0];

        return (char) (min+'a');
    }
}