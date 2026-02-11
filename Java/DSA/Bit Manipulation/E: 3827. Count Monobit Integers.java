https://leetcode.com/problems/count-monobit-integers/description/

// Time Complexity: O(log n) Space Complexity: O(1)
class Solution {
    public int countMonobit(int n) {
        int count=1;
        int k=1;
        while (true) {
            int val = (1<<k)-1;
            if (val>n) break;
            count++;
            k++;
        }

        return count;
    }
}