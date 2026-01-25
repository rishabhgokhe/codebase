https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/description/

// Time Complexity: O(n^2) Space Complexity: O(n)
class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }
        
        int count=0;
        while (!isIncreasing(list) && list.size()>=2) {
            int minSum = Integer.MAX_VALUE;
            int idx=-1;

            for (int i=0; i<list.size()-1; i++) {
                int sum = list.get(i)+list.get(i+1);
                if (sum < minSum) {
                    minSum=sum;
                    idx=i;
                }
            }

            int val = list.get(idx)+list.get(idx+1);
            list.set(idx, val);
            list.remove(idx+1);

            count++;
        }

        return count;

    }

    private boolean isIncreasing(List<Integer> list) {
        for (int i=0; i<list.size()-1; i++) {
            if (list.get(i)>list.get(i+1)) return false;
        }
        return true;
    }
}