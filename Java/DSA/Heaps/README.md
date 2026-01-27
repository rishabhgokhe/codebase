# Heaps (Priority Queue)

A **Heap** is a specialized tree-based data structure that satisfies the **heap property**.  
It is commonly used to efficiently retrieve the **minimum or maximum element** from a collection.

This section focuses on **heap fundamentals, types, operations, and common problem patterns** used in interviews.

---

## What is a Heap?

A heap is a **complete binary tree** where:
- **Min Heap:** Parent node is smaller than or equal to its children
- **Max Heap:** Parent node is greater than or equal to its children

Heaps are typically implemented using arrays.

---

## Types of Heaps

### 1. Min Heap
- Root contains the smallest element
- Used in shortest path and scheduling problems

---

### 2. Max Heap
- Root contains the largest element
- Used in ranking and selection problems

---

## Heap Representation

- Stored as an array
- For index `i`:
  - Left child: `2*i + 1`
  - Right child: `2*i + 2`
  - Parent: `(i - 1) / 2`

---

## Core Heap Operations

### Insert
- Add element at the end
- Heapify up to maintain heap property

---

### Remove (Extract Min/Max)
- Remove root element
- Replace with last element
- Heapify down

---

### Peek
- Returns root element without removing it

---

## Heapify

### Heapify Up
- Used after insertion
- Restores heap property by moving element upward

### Heapify Down
- Used after deletion
- Restores heap property by moving element downward

---

## Common Heap Techniques

### 1. Top K Elements
- Find K largest or smallest elements efficiently

---

### 2. Median in a Stream
- Uses two heaps (min + max)

---

### 3. Priority-Based Scheduling
- Tasks processed based on priority

---

### 4. Sorting with Heap
- Heap sort algorithm

---

## Common Heap Problem Patterns

- Kth largest / smallest element
- Merge K sorted arrays
- Sliding window median
- Minimum cost problems
- Frequency-based problems

---

## Time & Space Complexity

| Operation | Complexity |
|---------|------------|
| Insert  | O(log n)   |
| Remove  | O(log n)   |
| Peek   | O(1)       |
| Build Heap | O(n)   |

---

## When to Use Heaps

- When repeated min/max access is needed
- When processing elements by priority
- When maintaining dynamic order

---

## Common Mistakes

- Confusing min heap and max heap
- Forgetting heapify steps
- Using wrong comparator logic

---

## Key Insight

Heaps are ideal when **only the extreme element matters**, not full sorting.  
They provide a powerful balance between efficiency and simplicity.