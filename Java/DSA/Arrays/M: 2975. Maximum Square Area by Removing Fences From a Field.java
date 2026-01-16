https://leetcode.com/problems/maximum-square-area-by-removing-fences-from-a-field/

// Time Complexity: O(n^2). Space Complexity: O(h) where h is the number of horizontal fences.
import java.util.*;

class Solution {

    static final int MOD = 1000000007;
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        Arrays.sort(hFences);
        Arrays.sort(vFences);

        Set<Integer> possH = new HashSet<>();

        possH.add(m-1);
        for (int i=0; i<hFences.length; i++) {
            possH.add(hFences[i]-1);
            possH.add(m-hFences[i]);
            for (int j=i+1; j<hFences.length; j++) {
                possH.add(hFences[j]-hFences[i]);
            }
        }

        int maxSide =0;
        if (possH.contains(n-1)) maxSide=Math.max(maxSide, n-1);
        for (int i=0; i<vFences.length; i++) {
            if (possH.contains(vFences[i]-1)) {
                maxSide = Math.max(maxSide, vFences[i]-1);
            }
            if (possH.contains(n-vFences[i])) {
                maxSide = Math.max(maxSide, n-vFences[i]);
            }
            for (int j=i+1; j<vFences.length; j++) {
                if (possH.contains(vFences[j]-vFences[i])) {
                maxSide = Math.max(vFences[j]-vFences[i], maxSide);}
            }
        }

        if (maxSide == 0) return -1;
        return (int) ((long)maxSide * maxSide % MOD);
    }

}

// Explaination:
// 1. First we sort both the horizontal and vertical fences.
// 2. We create a set to store all possible heights of the square that can be formed by removing horizontal fences.
// 3. After we store all possible heights we can achieve from removing horizontal fences we just need to check it the same height can be achieved by removing vertical fences.
// 4. We iterate through all vertical fences and check if we can achieve the same height by removing vertical fences.
// 5. If we can achieve the same height we update our maximum side length of the square.
// 6. Finally we return the area of the square modulo 10^9 + 7. If no square can be formed we return -1.
