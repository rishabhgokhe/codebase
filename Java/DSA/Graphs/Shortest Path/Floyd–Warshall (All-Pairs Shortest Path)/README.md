# Floyd–Warshall Algorithm  
(All-Pairs Shortest Path)

The **Floyd–Warshall Algorithm** is a dynamic programming technique used to find the **shortest paths between all pairs of vertices** in a weighted graph.

It works for both directed and undirected graphs and supports **negative edge weights**, but does not allow negative weight cycles.

---

## What Problem Does It Solve?

Given:
- A graph with V vertices
- Weighted edges (can be negative)

The goal is to compute:
- Shortest distance between every pair of vertices

---

## Core Idea

Instead of finding shortest paths from one source, Floyd–Warshall:

- Considers each vertex as an intermediate node
- Gradually improves shortest distances
- Updates the distance matrix step by step

At each step:
We check whether going through an intermediate node gives a shorter path.

---

## DP State Definition

Let:

`dist[i][j]` = shortest distance from vertex `i` to vertex `j`

Transition:

`dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])`

Where:
- `k` is the intermediate vertex

---

## Algorithm Steps

1. Initialize distance matrix
   - 0 for same node
   - Edge weight if edge exists
   - Infinity if no direct edge

2. For each vertex `k`:
   - For each pair `(i, j)`:
     - Update distance using `k` as intermediate

3. Final matrix contains shortest distances between all pairs

---

## Time & Space Complexity

- **Time Complexity:** O(V³)
- **Space Complexity:** O(V²)

Because of three nested loops over vertices.

---

## When to Use Floyd–Warshall

- When all-pairs shortest path is required
- When number of vertices is small (dense graph)
- When negative weights are allowed
- When graph size is manageable

---

## When NOT to Use

- For very large graphs (too slow)
- When only single-source shortest path is required
- When negative cycles exist

---

## Detecting Negative Cycles

After running the algorithm:

If any `dist[i][i] < 0`,
→ The graph contains a **negative weight cycle**.

---

## Common Problem Patterns

- Find shortest path between every city pair
- Detect negative cycles
- Transitive closure of a graph
- Minimum cost between all node pairs

---

## Comparison with Other Algorithms

| Algorithm | Use Case | Time Complexity |
|------------|-----------|----------------|
| BFS | Unweighted graph | O(V + E) |
| Dijkstra | Weighted (no negative edges) | O((V + E) log V) |
| Bellman-Ford | Negative weights allowed | O(V * E) |
| Floyd–Warshall | All-pairs shortest path | O(V³) |

---

## Key Insight

Floyd–Warshall is essentially a **DP over vertices**, where each vertex is treated as a possible intermediate step in a path.

It trades higher time complexity for simplicity and the ability to compute all-pairs shortest paths in a single run.