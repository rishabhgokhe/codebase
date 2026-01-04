https://leetcode.com/problems/build-an-array-with-stack-operations/description/

// Time Complexity: O(M) Space Complexity: O(M)
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int idx = 0;
    
        for (int i=1; i<=target[target.length-1]; i++) {
            operations.add("Push");
            if (i == target[idx]) {
                idx++;
            } else {
                operations.add("Pop");
            }
        }

        return operations;
    }
}