https://leetcode.com/problems/time-needed-to-buy-tickets/

// Time Complexity: O(n*m) where n is the length of tickets array and m is the maximum number of tickets any person has. Space Complexity: O(1)
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count =0;
        while (tickets[k] != 0) {
            for (int i=0; i<tickets.length; i++) {
                if (tickets[i] == 0) continue;
                tickets[i]--;
                count++;
                if (tickets[k] == 0) break;
            }
        }

        return count;
    }
}