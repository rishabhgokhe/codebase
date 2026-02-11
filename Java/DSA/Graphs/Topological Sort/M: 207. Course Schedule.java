https://leetcode.com/problems/course-schedule/description/

// Time Complexity: O(V+E) Space Complexity: O(V)
class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        boolean[] vis = new boolean[n];
        boolean[] recPath = new boolean[n];

        for (int i=0; i<n; i++) {
            if(!vis[i]) {
                if (isCycle(i, vis, recPath, prerequisites)) return false;
            }
        }

        return true;
    }

    boolean isCycle(int curr, boolean[] vis, boolean[] recPath, int[][] edges) {
        vis[curr]=true;
        recPath[curr]=true;

        for (int i=0; i<edges.length; i++) {
            int v=edges[i][0];
            int u=edges[i][1];

            if (u==curr) {
                if (!vis[v]) {
                    if (isCycle(v, vis, recPath, edges)) {
                        return true;
                    }
                } else if (recPath[v]) {
                    return true;
                }
            }
        }

        recPath[curr]=false;
        return false;
    }
}