# Monotonic Stack

A **Monotonic Stack** is a stack data structure where elements are maintained in a **specific monotonic order** throughout execution.  
The order can be either **increasing** or **decreasing**, depending on the problem requirement.

This technique is mainly used to efficiently solve problems involving **next/previous greater or smaller elements** in linear time.

---

## Types of Monotonic Stack

### 1. Monotonic Increasing Stack
- Elements are stored in **increasing order** from bottom to top.
- Before pushing a new element, all elements **greater than it** are popped.

Used when finding:
- Next Smaller Element
- Previous Smaller Element

---

### 2. Monotonic Decreasing Stack
- Elements are stored in **decreasing order** from bottom to top.
- Before pushing a new element, all elements **smaller than it** are popped.

Used when finding:
- Next Greater Element
- Previous Greater Element

---

## Common Operations (Methods)

### Push Operation
- Before pushing, compare the current element with the top of the stack.
- Pop elements that violate the monotonic condition.
- Push the current element once the condition is satisfied.

---

### Pop Operation
- Performed when the current element breaks the stack’s monotonic order.
- Each element is pushed and popped **at most once**, ensuring linear time complexity.

---

### Peek / Top
- Used to identify the **nearest valid element** (greater or smaller).
- If the stack is empty, it means no such element exists.

---

## Value Stack vs Index Stack

### Value-Based Stack
- Stores actual values.
- Used when only comparison matters.

### Index-Based Stack
- Stores indices of elements.
- Used when:
  - Distance between elements is required
  - Area or range calculation is needed (e.g., histogram problems)

---

## Traversal Direction

### Left to Right
Used for:
- Next Greater Element
- Next Smaller Element

### Right to Left
Used for:
- Previous Greater Element
- Previous Smaller Element

---

## Key Characteristics

- Each element is pushed **once**
- Each element is popped **once**
- Total operations are bounded by **O(n)**

---

## Time & Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

## When to Use Monotonic Stack

- Problems involving:
  - Nearest greater/smaller element
  - Range-based optimization
  - Continuous subarrays
- When brute-force solutions lead to **nested loops**

---

## Core Insight

The power of a monotonic stack lies in the fact that it **eliminates unnecessary comparisons** by maintaining a strict order, allowing efficient lookups for nearest valid elements.