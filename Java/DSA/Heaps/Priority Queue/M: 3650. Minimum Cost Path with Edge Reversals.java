https://leetcode.com/problems/minimum-cost-path-with-edge-reversals/description/

// Time Complexity: O(E log V) Space Complexity: O(V + E)

class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>();

        for (int i=0; i<n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e:edges) {
            int u=e[0];
            int v=e[1];
            int w=e[2];
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, 2*w});
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0]=0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1]-b[1]
        );

        pq.offer(new int[]{0,0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int v=curr[0];
            int d=curr[1];

            if (d>dist[v]) continue;

            for (int[] edge: adj.get(v)) {
                int next=edge[0];
                int cost=edge[1];
                if (dist[next] >d+cost) {
                    dist[next]=d+cost;
                    pq.offer(new int[]{next, dist[next]});
                }
            }

        }

        return dist[n-1] == Integer.MAX_VALUE ? -1: dist[n-1];

    }
}

// Approach: Using Dijikstra's Algorithm
// 1. create an adjacency list (of the format List<List<int[]>>) to represent the graph.. here some can have doubts..
// 2. why we are using two List cant we direclty use List<int[]>.. by doing this we are only adding bug prone code.. the second list is used to store all the possible edges of a node.. ill explain it shortly..
// 3. fill the adjacency list with every edge from the edges array.. here we also add the reversing possibility of every edge with double the cost..
// 4. now create a dist array which store dist of every node from the starting pos.. and initilise the dist array with infinty Value.
// 5. create a priority queue to store the node and its dist value.. the queue is sorted based on the dist value..
// 6. now we will run a loop till the priority queue is empty..
//     1. poll the top element from the queue..
//     2. if the dist value of the polled node is greater than the dist value
//          in the dist array we will continue.. as we have already found a better path..
//     3. now we will traverse all the edges of the current node..
//         1. if the dist value of the next node is greater than the current dist + cost of the edge..
//             1. update the dist value of the next node..
//             2. add the next node and its dist value to the priority queue..
// 7. finally return the dist value of the last node.. if its still infinity return -1