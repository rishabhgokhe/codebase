https://leetcode.com/problems/maximum-capacity-within-budget/description/

// Time Complexity: O(nlogn) Space Complexity: O(n)
class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int[][] a = new int[n][2];

        for (int i=0; i<n; i++) {
            a[i][0] = costs[i];
            a[i][1] = capacity[i];
        }

        Arrays.sort(a, (x,y) -> x[0]-y[0]);

        int[] pre = new int[n];
        pre[0] = a[0][1];
        for (int i=1; i<n; i++) {
            pre[i] = Math.max(pre[i-1], a[i][1]);
        }

        int ans=0;

        for (int i=0; i<n; i++) {
            if (a[i][0] < budget) {
                ans = Math.max(ans, a[i][1]);
            }

            int rem = budget - a[i][0]-1;
            if (rem<=0) continue;

            int l=0, r=i-1, pos=-1;
            while (l<=r) {
                int mid = (l+r)/2;
                if (a[mid][0]<=rem) {
                    pos=mid;
                    l=mid+1;
                } else {
                    r=mid-1;
                }
            }

            if (pos!=-1) {
                ans = Math.max(ans, a[i][1]+pre[pos]);
            }
        }

        return ans;
    }
}

// Explaination:
// 1. As the question demands the sum of cost which should be strictly less than budget and the capacity should be maximum..
// 2. so for this we should first combine the cost and capacity... into a single 2D array.
// 3. then we sort the previously made 2D array using Array.sort() and as the array is a 2d array.. we need to use the lamda function inside the sort method for two rows comparison..
// 4. for aqcurring the maximum capacity of any element with the minimum cost.. we will make a prefix array which will store the maximum capacity till that index..
// 5. iterate though each element of the 2d array and check if the cost of that element is less than budget.. if yes then we will update our answer with the maximum of current answer and capacity of that element..
// 6. if not we use binary search to find the maximum index where the cost is less than the remaining budget after subtracting the current element cost and 1..
// 7. if we get a valid index then we will update our answer with the maximum of current.