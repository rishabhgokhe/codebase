class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];  // Array to hold the first n ugly numbers
        ugly[0] = 1;  // The first ugly number is 1
        
        int p2 = 0, p3 = 0, p5 = 0;  // Pointers for multiples of 2, 3, and 5
        
        for (int i = 1; i < n; i++) {
            // Calculate the next ugly number by finding the minimum among the three candidates
            int nextUgly = Math.min(ugly[p2] * 2, Math.min(ugly[p3] * 3, ugly[p5] * 5));
            
            ugly[i] = nextUgly;  // Store the next ugly number
            
            // Increment the corresponding pointer(s)
            if (nextUgly == ugly[p2] * 2) p2++;
            if (nextUgly == ugly[p3] * 3) p3++;
            if (nextUgly == ugly[p5] * 5) p5++;
        }
        
        return ugly[n - 1];  // Return the nth ugly number
    }
}

// view question description - https://leetcode.com/problems/ugly-number-ii/