# Breadth-First Search (BFS)

**Breadth-First Search (BFS)** is a graph traversal algorithm that explores nodes **level by level**, visiting all immediate neighbors before moving to the next level.

This section focuses on **BFS fundamentals, traversal logic, and common problem patterns** used in interviews and competitive programming.

---

## What is BFS?

BFS starts from a source node and explores all reachable nodes in increasing order of distance.  
It uses a **queue** to maintain the traversal order.

BFS guarantees the **shortest path** in unweighted graphs.

---

## How BFS Works

1. Start from a source node
2. Mark it as visited
3. Push it into a queue
4. While the queue is not empty:
   - Dequeue a node
   - Visit all unvisited neighbors
   - Mark them visited and enqueue them

---

## BFS Traversal Characteristics

- Explores graph level by level
- Uses FIFO order
- Avoids revisiting nodes using a visited structure

---

## BFS Applications

- Shortest path in unweighted graphs
- Level-order traversal of trees
- Finding connected components
- Cycle detection in undirected graphs
- Grid-based problems

---

## BFS in Different Data Structures

### Graphs
- Uses adjacency list or matrix

### Trees
- Known as level-order traversal

### Grids / Matrices
- Uses direction arrays
- Common in flood fill and island problems

---

## Common BFS Problem Patterns

- Shortest path problems
- Minimum steps or moves
- Multi-source BFS
- State-based BFS (node + extra state)
- Grid traversal problems

---

## Time & Space Complexity

- **Time Complexity:** O(V + E)
- **Space Complexity:** O(V)

---

## When to Use BFS

- When the shortest path is required
- When processing level-wise data
- When recursion depth could be too large
- When working with unweighted graphs

---

## Common Mistakes

- Forgetting to mark nodes as visited early
- Using stack instead of queue
- Reprocessing the same node multiple times

---

## Key Insight

BFS works because it explores nodes in **order of increasing distance** from the source.  
Whenever a problem asks for the **minimum number of steps**, BFS is often the correct approach.