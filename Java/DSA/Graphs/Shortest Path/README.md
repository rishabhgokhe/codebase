# Shortest Path

The **Shortest Path** problem focuses on finding the minimum distance, cost, or steps required to travel from one node to another in a graph.

This section covers **core shortest path algorithms, when to use them, and common problem patterns** asked in interviews and competitive programming.

---

## What is the Shortest Path Problem?

Given:
- A graph (directed or undirected)
- Possibly weighted edges
- A source node

The goal is to compute:
- Minimum distance to a destination node
- Minimum distance to all nodes from the source

---

## Types of Shortest Path Problems

### 1. Single-Source Shortest Path (SSSP)
- Find shortest distance from one source to all other nodes

---

### 2. Single-Source to Single-Destination
- Find shortest distance between two specific nodes

---

### 3. All-Pairs Shortest Path
- Find shortest paths between every pair of nodes

---

## Algorithms Covered

### 1. BFS (Unweighted Graph)
- Used when all edges have equal weight
- Guarantees shortest path in O(V + E)

---

### 2. Dijkstra’s Algorithm
- Used for weighted graphs with non-negative weights
- Uses a priority queue (min heap)
- Time Complexity: O((V + E) log V)

---

### 3. Bellman-Ford Algorithm
- Handles negative weights
- Detects negative weight cycles
- Time Complexity: O(V * E)

---

### 4. Floyd-Warshall Algorithm
- All-pairs shortest path
- Works with negative weights (no negative cycles)
- Time Complexity: O(V³)

---

## Choosing the Right Algorithm

| Graph Type | Recommended Algorithm |
|------------|-----------------------|
| Unweighted | BFS |
| Weighted (no negative edges) | Dijkstra |
| Weighted (negative edges allowed) | Bellman-Ford |
| All pairs shortest path | Floyd-Warshall |

---

## Common Shortest Path Problem Patterns

- Minimum steps in a grid
- Cheapest flight within K stops
- Network delay time
- Minimum cost to reach destination
- Path with constraints

---

## Key Concepts

- Relaxation of edges
- Distance array
- Priority queue optimization
- Cycle detection (negative cycles)
- Graph representation (adjacency list preferred)

---

## Time & Space Complexity

Depends on:
- Number of vertices (V)
- Number of edges (E)
- Algorithm used

Most common interview solution:
- **Dijkstra → O((V + E) log V)**

---

## When to Use Shortest Path Techniques

- When minimizing cost, distance, or time
- When graph edges represent weights
- When steps must be minimized

---

## Common Mistakes

- Using Dijkstra with negative weights
- Not updating distances properly
- Forgetting to handle unreachable nodes
- Incorrect graph representation

---

## Key Insight

Shortest path problems are about **choosing the right traversal strategy based on edge weights**.  
Understanding graph properties is more important than memorizing algorithms.