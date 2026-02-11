# Design Data Structure

The **Design Data Structure** section focuses on building custom data structures that efficiently support specific operations under given constraints.

These problems test:
- Deep understanding of core data structures
- Optimization skills
- Ability to combine multiple concepts

This topic is very common in product-based company interviews.

---

## What is a Design Data Structure Problem?

You are given a set of required operations and constraints, such as:

- Insert
- Delete
- Search
- Get minimum / maximum
- Get random element
- Maintain order

Your goal is to design a data structure that supports all operations efficiently.

---

## Key Concepts Used in Design Problems

Most design problems combine multiple concepts:

- Hashing
- Stack / Queue
- Linked List
- Heap / Priority Queue
- Tree / BST
- Doubly Linked List
- Graph structures

Understanding how to combine these efficiently is crucial.

---

## Common Design Patterns

### 1. HashMap + Linked List
- Used for LRU Cache
- Maintains order + fast lookup

---

### 2. Two Heaps
- Used for Median Finder
- Maintain lower half and upper half

---

### 3. HashMap + Stack
- Used for Frequency Stack

---

### 4. Custom Node Structures
- Used when additional metadata is required
- Helps maintain constant-time updates

---

## Common Design Problems

- LRU Cache
- LFU Cache
- Min Stack
- Randomized Set
- Design Twitter
- Design Browser History
- Median Finder

---

## Time & Space Optimization Goals

Design problems usually require:

- O(1) for insert, delete, search (if possible)
- O(log n) when ordering or priority is involved
- Efficient memory usage

---

## Approach to Solving Design Problems

1. Carefully read operation constraints
2. Identify required time complexity
3. Choose base data structures
4. Combine them logically
5. Handle edge cases
6. Analyze complexity

---

## Common Mistakes

- Ignoring time complexity requirements
- Using inefficient built-in structures blindly
- Not handling edge cases
- Forgetting to update multiple structures consistently

---

## When to Focus on This Topic

- Preparing for product-based companies
- Preparing for system-style coding rounds
- When interview questions focus on API-style implementation

---

## Key Insight

Design Data Structure problems test your ability to **think structurally and combine concepts efficiently**.

The solution is rarely about a single data structure —  
it is about **engineering the right combination**.