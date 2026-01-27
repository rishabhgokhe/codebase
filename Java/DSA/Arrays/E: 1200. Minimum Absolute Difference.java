https://leetcode.com/problems/minimum-absolute-difference/

// Time Complexity: O(N log N) Space Complexity: O(1)
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minAbs = Integer.MAX_VALUE;

        for (int i=0; i<n-1; i++) {
            minAbs = Math.min(arr[i+1]-arr[i], minAbs);
        }

        for (int i=0; i<n-1; i++) {
            if (arr[i+1]-arr[i] == minAbs) {
                list.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        return list;
    }
}