// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

// Brute Force Approach - Time Complexity: O(n^2) Space Complexity: O(1)
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = prices[i];

            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    answer[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return answer;
    }
}

// Monotonic Stack Approach - Time Complexity: O(n) Space Complexity: O(n)
import java.util.*;

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = prices.clone();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                answer[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
        }

        return answer;
    }
}