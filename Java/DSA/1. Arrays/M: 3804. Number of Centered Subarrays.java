https://leetcode.com/problems/number-of-centered-subarrays/

// Time Complexity: O(N^2) Space Complexity: O(N)
import java.util.*;

class Solution {
    public int centeredSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i=0; i<n; i++) {
            int sum =0;
            Set<Integer> set = new HashSet<>();

            for (int j=i; j<n; j++) {
                sum += nums[j];
                set.add(nums[j]);

                if (set.contains(sum)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}