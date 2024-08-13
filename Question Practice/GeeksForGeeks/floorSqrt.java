class Solution {
    long floorSqrt(long n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long start = 1, end = n, result = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            }

            if (mid * mid < n) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }

        return result;

    }
}

// view question description - https://www.geeksforgeeks.org/problems/square-root/1