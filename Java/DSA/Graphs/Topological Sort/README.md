# Topological Sort

**Topological Sort** is a linear ordering of vertices in a **Directed Acyclic Graph (DAG)** such that for every directed edge (u → v), vertex `u` comes before `v` in the ordering.

It is mainly used for problems involving **dependencies and ordering constraints**.

---

## What is Topological Sorting?

Given:
- A directed graph
- No cycles (DAG)

The goal is to produce an ordering of nodes where:
- All dependency constraints are satisfied

If the graph contains a cycle, topological sorting is not possible.

---

## Where It Is Used

- Task scheduling
- Course prerequisite problems
- Dependency resolution
- Build systems
- Compilation order

---

## Methods to Perform Topological Sort

### 1. DFS-Based Approach

- Perform DFS traversal
- Push node to stack after exploring all neighbors
- Reverse stack to get topological order

Works because nodes are added only after their dependencies are resolved.

Time Complexity: O(V + E)

---

### 2. Kahn’s Algorithm (BFS-Based)

- Compute in-degree of all nodes
- Add nodes with in-degree 0 to queue
- Remove node from queue
- Decrease in-degree of its neighbors
- Repeat until queue is empty

If processed nodes < total nodes → cycle exists.

Time Complexity: O(V + E)

---

## Key Concepts

### In-Degree
- Number of incoming edges to a node
- Nodes with in-degree 0 can be processed first

### DAG (Directed Acyclic Graph)
- Required condition for topological sorting
- Presence of cycle makes ordering impossible

---

## Applications in Problems

- Course schedule
- Alien dictionary
- Task ordering
- Detecting cycles in directed graphs
- Longest path in DAG

---

## Time & Space Complexity

- **Time Complexity:** O(V + E)
- **Space Complexity:** O(V)

---

## When to Use Topological Sort

- When ordering with dependency constraints is required
- When working with DAG
- When determining valid build or execution sequence

---

## Common Mistakes

- Applying on graphs with cycles
- Forgetting to check cycle detection
- Incorrect in-degree updates

---

## Key Insight

Topological Sort is fundamentally about **resolving dependencies in the correct order**.

If a problem says:
- “You must complete A before B”
- “Tasks have prerequisites”
- “Dependencies exist”

→ Think **Topological Sorting**.