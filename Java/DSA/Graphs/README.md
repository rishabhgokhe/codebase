# Graphs

A **Graph** is a non-linear data structure used to represent relationships between entities.  
Graphs are widely used to model **networks, paths, dependencies, and connections**.

This section focuses on **graph fundamentals, traversal techniques, and core problem patterns** commonly asked in interviews.

---

## What is a Graph?

A graph consists of:
- **Vertices (Nodes)** – represent entities
- **Edges** – represent connections between nodes

Graphs can represent real-world systems like social networks, maps, computer networks, and dependency graphs.

---

## Types of Graphs

### 1. Directed Graph
- Edges have a direction
- Example: task dependencies

---

### 2. Undirected Graph
- Edges have no direction
- Example: road networks

---

### 3. Weighted Graph
- Edges have weights or costs
- Used in shortest path problems

---

### 4. Unweighted Graph
- All edges have equal weight

---

### 5. Cyclic and Acyclic Graphs
- Cyclic: contains cycles
- Acyclic: no cycles (e.g., DAG)

---

## Graph Representation

### Adjacency List
- Stores neighbors for each vertex
- Space-efficient
- Most commonly used

---

### Adjacency Matrix
- Uses a 2D matrix
- Fast edge lookup
- Higher space usage

---

## Graph Traversal Techniques

### 1. Breadth-First Search (BFS)
- Explores nodes level by level
- Uses a queue
- Finds shortest path in unweighted graphs

---

### 2. Depth-First Search (DFS)
- Explores deeply before backtracking
- Uses recursion or stack
- Useful for cycle detection and connectivity

---

## Common Graph Algorithms

- Cycle detection
- Topological sorting
- Shortest path algorithms
- Minimum spanning tree
- Connected components

---

## Common Graph Problem Patterns

- Path existence
- Shortest path
- Connectivity checking
- Grid-based traversal
- Dependency resolution

---

## Time & Space Complexity

- BFS / DFS: O(V + E)
- Space: O(V + E) for adjacency list

---

## When to Use Graphs

- When relationships between data points matter
- When paths, connectivity, or dependencies are involved
- When modeling networks or grids

---

## Key Insight

Most graph problems reduce to **choosing the right traversal** and **correct graph representation**.  
Understanding how nodes are connected is more important than the number of algorithms memorized.