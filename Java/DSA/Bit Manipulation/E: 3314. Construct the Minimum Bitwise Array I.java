https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/description/

// Time Complexity: O(n^2) Space Complexity: O(1)
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] res = new int[n];

        for (int i=0; i<n; i++) {
            for(int j=0; j<=nums.get(i); j++) {
                if ((j|(j+1))==nums.get(i)) {
                    res[i]=j;
                    break;
                } else {
                    res[i]=-1;
                }
            }
        }

        return res;
    }
}