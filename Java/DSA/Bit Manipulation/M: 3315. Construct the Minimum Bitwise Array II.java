https://leetcode.com/problems/construct-the-minimum-bitwise-array-ii/description/

// Time Complexity: O(N) Space Complexity: O(1)
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if ((n & 1) == 1)
                res[i] = n & ~(((n + 1) & ~n) >> 1);
            else
                res[i] = -1;
        }
        return res;
        
    }
}