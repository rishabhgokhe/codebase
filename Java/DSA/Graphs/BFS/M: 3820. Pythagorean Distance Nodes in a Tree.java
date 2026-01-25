https://leetcode.com/problems/pythagorean-distance-nodes-in-a-tree/

// Time Complexity: O(N log N) Space Complexity: O(N)
class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        List<List<Integer>> g = new ArrayList<>();
        
        for (int i=0; i<n; i++) g.add(new ArrayList<>());

        for(int[] e : edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }

        int[] dx=bfs(g, n, x);
        int[] dy=bfs(g, n, y);
        int[] dz=bfs(g, n, z);

        int count=0;
        for (int i=0; i<n; i++) {
            int[] arr = { dx[i], dy[i], dz[i]};
            Arrays.sort(arr);

            long a=arr[0], b=arr[1], c=arr[2];
            if (a*a + b*b == c*c) {
                count++;
            }
        }

        return count;
    }

    private int[] bfs(List<List<Integer>> graph, int n, int src) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new ArrayDeque<>();
        q.add(src);
        dist[src]=0;

        while (!q.isEmpty()) {
            int u=q.poll();
            for (int v:graph.get(u)) {
                if (dist[v]==-1) {
                    dist[v]=dist[u]+1;
                    q.add(v);
                }
            }
        }
        return dist;
    }
}