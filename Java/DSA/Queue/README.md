# Queue

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle.  
It is widely used in problems involving **order preservation, scheduling, and level-wise processing**.

This section focuses on **queue fundamentals, variants, and common problem-solving patterns**.

---

## What is a Queue?

A queue allows insertion of elements at one end (**rear**) and removal from the other end (**front**).  
The first element inserted is the first one to be removed.

---

## Core Queue Operations

### Enqueue
- Adds an element to the rear of the queue

### Dequeue
- Removes an element from the front of the queue

### Front / Peek
- Returns the front element without removing it

### IsEmpty
- Checks whether the queue is empty

---

## Queue Implementations

Queues can be implemented using:
- Arrays
- Linked Lists
- Circular arrays
- Built-in queue libraries

Each approach has different space and performance trade-offs.

---

## Types of Queues

### 1. Simple Queue
- Basic FIFO behavior
- Inefficient if implemented using arrays without circular logic

---

### 2. Circular Queue
- Rear wraps around to the front
- Efficient memory utilization

---

### 3. Deque (Double-Ended Queue)
- Allows insertion and deletion from both ends
- Supports stack and queue behavior

---

### 4. Priority Queue
- Elements are removed based on priority
- Commonly implemented using heaps

---

## Common Queue Techniques

### 1. Level-Order Processing
- Used in tree and graph traversal (BFS)

---

### 2. Sliding Window with Deque
- Optimizes window-based maximum/minimum problems

---

### 3. Scheduling & Simulation
- Models real-world systems like CPU scheduling and task queues

---

## Common Problem Patterns

- Breadth-First Search (BFS)
- First non-repeating character in a stream
- Sliding window maximum
- Task scheduling
- Queue using stack and vice versa

---

## Time & Space Complexity

| Operation | Complexity |
|----------|------------|
| Enqueue  | O(1)       |
| Dequeue  | O(1)       |
| Peek    | O(1)       |

---

## When to Use Queue

- When processing elements in arrival order
- When level-wise or breadth-wise traversal is needed
- When simulating real-world queues or scheduling

---

## Key Insight

Queues are ideal when **order of processing matters**.  
Recognizing FIFO behavior in a problem often directly points to a queue-based solution.