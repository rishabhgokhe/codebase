https://leetcode.com/problems/rotate-non-negative-elements/

// Time Complexity: O(n) Space Complexity: O(n)
class Solution {
    public int[] rotateElements(int[] nums, int k) {

        List<Integer> posNum = new ArrayList<>();
        for (int num:nums) {
            if (num>=0) posNum.add(num);
        }

        int n=posNum.size();
        if (n==0) return nums;

        k=k%n;
        List<Integer> rotated = new ArrayList<>();
        for (int i=k; i<n; i++) {
            rotated.add(posNum.get(i));
        }
        for(int i=0; i<k; i++) {
            rotated.add(posNum.get(i));
        }

        int idx=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]>=0) {
                nums[i] = rotated.get(idx++);
            }
        }

        return nums;
    }
}