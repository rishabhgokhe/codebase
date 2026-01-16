https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

// Time Complexity: O(N) Space Complexity: O(1)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index]>0) {
                nums[index] = -nums[index];
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }

        return result;
    }
}