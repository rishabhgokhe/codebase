https://leetcode.com/problems/exclusive-time-of-functions/description/

// Time Complexity: O(L) Space Complexity: O(N) where L is number of logs and N is number of functions
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        int prevTime = 0;

        Stack<Integer> stack = new Stack<>();

        for (String log: logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += time - prevTime;
                }
                stack.push(id);
                prevTime = time;
            } else {
                int finished = stack.pop();
                result[finished] += time - prevTime + 1;
                prevTime = time +1;
            }
        }

        return result;
    }
}