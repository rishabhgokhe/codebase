# Circular Array

A **Circular Array** is a conceptual structure where the end of the array connects back to the beginning, forming a loop.

It is widely used in problems involving:
- Rotation
- Cyclic traversal
- Wrap-around behavior
- Circular queues
- Next greater element in circular array

This section focuses on understanding circular behavior and common problem patterns.

---

## What is a Circular Array?

In a circular array:
- The element after the last index connects to index 0
- Traversal continues in a cyclic manner

For an array of size `n`:
- Next index of `i` = `(i + 1) % n`
- Previous index of `i` = `(i - 1 + n) % n`

Modulo operation is the key to circular traversal.

---

## Why Circular Arrays?

Some problems naturally wrap around, such as:
- Clock-based problems
- Rotations
- Circular queues
- Finding next greater element in circular fashion

Using modulo arithmetic helps simulate circular behavior without physically rotating the array.

---

## Common Circular Array Techniques

### 1. Modulo Indexing
- Use `% n` to wrap around
- Avoid index out-of-bounds

---

### 2. Simulating Two Pass Traversal
- Traverse from `0` to `2*n - 1`
- Access element using `i % n`
- Common in circular next greater element problems

---

### 3. Rotation-Based Logic
- Instead of rotating array physically
- Adjust starting index logically

---

## Common Problem Patterns

- Next greater element (circular)
- Gas station problem
- Circular subarray sum
- Rotating array
- Circular queue implementation

---

## Time & Space Complexity

- Traversal remains O(n)
- Sometimes requires O(n) extra space (stack or auxiliary array)

---

## When to Use Circular Array Logic

- When array is described as circular
- When last element connects to first
- When problems mention wrap-around behavior
- When dealing with rotations

---

## Common Mistakes

- Forgetting modulo operation
- Infinite loops due to improper stopping condition
- Physically rotating array unnecessarily
- Negative modulo mistakes

---

## Key Insight

Circular arrays are usually not a different data structure —  
they are a **different way of thinking about indexing**.

If a problem says:
- “Circular”
- “Wrap around”
- “After last element go to first”

→ Think **modulo indexing**.