https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

// Time Complexity: O(n^2 log n) Space Complexity: O(n^2)

class Solution {
    public int kthSmallest(int[][] m, int k) {
        int n = m.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2]-b[2]);
        boolean[][] vis = new boolean[n][n];
        pq.offer(new int[]{0, 0, m[0][0]});
        int count=0;

        while (!pq.isEmpty()){
            int[] curr = pq.poll();
            count++;
            if (count==k) return curr[2];

            // for right
            if (curr[1]+1<n && !vis[curr[0]][curr[1]+1]) {
                pq.offer(new int[]{curr[0], curr[1]+1, m[curr[0]][curr[1]+1]});
                vis[curr[0]][curr[1]+1]=true;
            }

            // for down
            if (curr[0]+1<n && !vis[curr[0]+1][curr[1]]) {
                pq.offer(new int[]{curr[0]+1, curr[1], m[curr[0]+1][curr[1]]});
                vis[curr[0]+1][curr[1]]=true;
            }
        }

        return -1;

    }
}