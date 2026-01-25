# Depth-First Search (DFS)

**Depth-First Search (DFS)** is a graph traversal algorithm that explores a path **as deeply as possible** before backtracking.

This section focuses on **DFS fundamentals, traversal logic, and common problem patterns** commonly used in interviews and competitive programming.

---

## What is DFS?

DFS starts from a source node and explores one of its neighbors completely before moving to another neighbor.  
It can be implemented using **recursion** or an **explicit stack**.

DFS is particularly useful when exploring **all possible paths or components**.

---

## How DFS Works

1. Start from a source node
2. Mark it as visited
3. Recursively visit each unvisited neighbor
4. Backtrack when no unvisited neighbors remain

---

## DFS Traversal Characteristics

- Explores deeply before breadth
- Uses stack behavior (implicit or explicit)
- Suitable for exhaustive exploration

---

## DFS Implementation Approaches

### Recursive DFS
- Simple and intuitive
- Uses call stack

### Iterative DFS
- Uses an explicit stack
- Avoids recursion depth issues

---

## DFS Applications

- Cycle detection
- Connected components
- Topological sorting
- Path finding
- Backtracking problems

---

## DFS in Different Data Structures

### Graphs
- Uses adjacency list or matrix

### Trees
- Used for preorder, inorder, and postorder traversals

### Grids
- Used in flood fill and island counting

---

## Common DFS Problem Patterns

- All paths exploration
- Component counting
- Detecting cycles
- Grid traversal
- Backtracking-based problems

---

## Time & Space Complexity

- **Time Complexity:** O(V + E)
- **Space Complexity:** O(V)

Space includes recursion stack or explicit stack.

---

## When to Use DFS

- When exploring all possibilities
- When depth matters more than distance
- When checking connectivity or cycles
- When solving backtracking problems

---

## Common Mistakes

- Stack overflow due to deep recursion
- Forgetting to mark nodes as visited
- Incorrect backtracking logic

---

## Key Insight

DFS works by **fully exploring one path before trying another**.  
It is ideal for problems that require exhaustive search or structural analysis.