import java.util.Arrays;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (countPairs(nums, mid) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }

    private int countPairs(int[] nums, int maxDist) {
        int count = 0;
        int j = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] - nums[i] <= maxDist) {
                j++;
            }
            count += j - i - 1;
        }
        
        return count;
    }
}



// import java.util.ArrayList;
// import java.util.Collections;

// class Solution {
//     public int smallestDistancePair(int[] nums, int k) {
//         ArrayList<Integer> result = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 int diff = Math.abs(nums[i] - nums[j]);
//                 result.add(diff);
//             }
//         }
//         Collections.sort(result);
//         return result.get(k - 1);
//     }
// }


// import java.util.ArrayList;
// import java.util.Arrays;
// class Solution {
//     public int smallestDistancePair(int[] nums, int k) {
//         ArrayList<Integer> result = new ArrayList<>();
//         for (int i=0; i< nums.length; i++) {
//             if (i == (nums.length-1)) {
//                 diff = nums[i] - nums[0];
//             } else {
//                 int diff = nums[i] - nums[i+1];
//             }
//             if (diff < 0) {
//                 diff *= (-1);
//             }
//             result.add(diff);
//         }
//     }
//     Arrays.sort(result);
//     return result[k];
// }