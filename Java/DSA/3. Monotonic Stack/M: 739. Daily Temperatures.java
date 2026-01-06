https://leetcode.com/problems/daily-temperatures/description/

// Brute Force Solution Time Complexity : O(n^2) Space Complexity : O(1)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        return ans;
    }
}

// Monotonic Stack Solution Time Complexity : O(n) Space Complexity : O(n)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[n];

        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prev = stack.pop();
                answer[prev] = i-prev;
            }
            stack.push(i);
        }

        return answer;

    }
}