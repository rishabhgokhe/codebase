# Priority Queue

A **Priority Queue** is an abstract data structure where each element is associated with a **priority**, and elements are removed based on priority rather than insertion order.

This section focuses on **priority queue concepts, behavior, and common problem patterns** used in interviews and competitive programming.

---

## What is a Priority Queue?

In a priority queue:
- Each element has a priority
- Higher (or lower) priority elements are served first
- Order of insertion does not determine order of removal

Priority queues are commonly implemented using **heaps**.

---

## Types of Priority Queue

### 1. Min Priority Queue
- Element with the **smallest priority** is removed first
- Commonly used for shortest path and scheduling problems

---

### 2. Max Priority Queue
- Element with the **largest priority** is removed first
- Used in ranking and selection problems

---

## Core Priority Queue Operations

### Insert
- Adds an element with a given priority

### Remove / Poll
- Removes and returns the highest-priority element

### Peek
- Returns the highest-priority element without removing it

### IsEmpty
- Checks whether the queue is empty

---

## Priority Queue Implementation

- Usually implemented using:
  - Min Heap
  - Max Heap
- Supports custom comparators for priority definition

---

## Common Priority Queue Techniques

### 1. Top K Problems
- Find K largest or smallest elements efficiently

---

### 2. Scheduling Problems
- Tasks processed based on priority or time

---

### 3. Greedy Algorithms
- Always pick the best available option

---

### 4. Multi-Source Problems
- Handle multiple candidates efficiently

---

## Common Problem Patterns

- Kth largest / smallest element
- Merge K sorted lists
- Task scheduling
- CPU scheduling
- Dijkstra’s algorithm

---

## Time & Space Complexity

| Operation | Complexity |
|---------|------------|
| Insert  | O(log n)   |
| Remove | O(log n)   |
| Peek   | O(1)       |

---

## When to Use Priority Queue

- When elements must be processed by priority
- When repeated min/max extraction is required
- When sorting is unnecessary but ranking is important

---

## Common Mistakes

- Using wrong heap type (min vs max)
- Incorrect comparator logic
- Assuming insertion order is preserved

---

## Key Insight

A priority queue focuses on **importance, not order**.  
It is a core tool for greedy and optimization problems where the best choice must be selected efficiently.