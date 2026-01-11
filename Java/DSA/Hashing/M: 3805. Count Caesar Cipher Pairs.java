https://leetcode.com/problems/count-caesar-cipher-pairs/


// Time Complexity: O(n.k) where n is the number of words and k is the average length of the words. Space Complexity: O(n)
class Solution {
    public long countPairs(String[] words) {
        Map<String, Long> map = new HashMap<>();

        for (String word: words) {
            String s = normalise(word);
            map.put(s, map.getOrDefault(s, 0L) +1);
        }

        long ans =0;
        for (long count: map.values()) {
            ans += count * (count-1)/2;
        }

        return ans;
    }

    private String normalise(String word) {
        char base = word.charAt(0);
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            int diff = (c-base+26)%26;
            sb.append((char) ('a'+diff));
        }

        return sb.toString();
    }
}