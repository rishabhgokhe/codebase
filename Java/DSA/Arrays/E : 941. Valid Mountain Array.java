https://leetcode.com/problems/valid-mountain-array/description/

// Time Complexity: O(n) Space Complexity: O(1)
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i=0;
        if (n<3) return false;

        while (i+1<n && arr[i] < arr[i+1]) {
            i++;
        }

        if (i==0 || i == n-1) return false;

        while (i+1<n && arr[i] > arr[i+1]) {
            i++;
        }

        return i==n-1;
    }
}