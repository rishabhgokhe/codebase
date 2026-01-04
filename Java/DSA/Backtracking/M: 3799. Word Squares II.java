https://leetcode.com/problems/word-squares-ii/description/

// Time Complexity: O(N^4) Space Complexity: O(1)
import java.util.*;

class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ans = new ArrayList<>();
        int n = words.length;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if ( j==i ) continue;

                for (int k=0; k<n; k++) {
                    if (k==i || k==j) continue;

                    for (int l=0; l<n; l++) {
                        if (l==i || l==j || l==k) continue;

                        String top = words[i];
                        String left = words[j];
                        String right = words[k];
                        String bottom = words[l];

                        if (top.charAt(0) == left.charAt(0) && top.charAt(3) == right.charAt(0) && bottom.charAt(0) == left.charAt(3) && bottom.charAt(3) == right.charAt(3)) {
                            ans.add(Arrays.asList(top,left, right, bottom));
                        }
                    }
                }
            }
        }

        ans.sort((a,b) -> {
            for (int i=0; i<4; i++) {
                int compare = a.get(i).compareTo(b.get(i));
                if (compare != 0) return compare;
            }
            return 0;
        });

        return ans;
    }
}