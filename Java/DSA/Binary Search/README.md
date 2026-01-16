# Binary Search

**Binary Search** is an efficient searching technique used on **sorted or monotonic data** to find an element or an optimal answer by repeatedly dividing the search space into halves.

This section focuses on **binary search concepts, variations, and problem-solving patterns** commonly asked in interviews.

---

## What is Binary Search?

Binary Search works by comparing the target value with the **middle element** of the search space:
- If the target is smaller, search the left half
- If the target is larger, search the right half
- If equal, the element is found

This process continues until the search space is exhausted.

---

## Prerequisites

- Data must be **sorted** or follow a **monotonic condition**
- Random access to elements (arrays)

---

## Types of Binary Search

### 1. Standard Binary Search
- Finds the exact position of a target element
- Used in sorted arrays

---

### 2. Lower Bound
- Finds the first position where an element is **not less than** the target

---

### 3. Upper Bound
- Finds the first position where an element is **greater than** the target

---

### 4. Binary Search on Answer
- Searches for an optimal value
- Used when direct computation is difficult

Examples:
- Minimum capacity
- Maximum feasible distance
- Minimum time problems

---

## Binary Search Templates

### Iterative Approach
- Preferred for better space efficiency

### Recursive Approach
- Easier to conceptualize
- Uses extra stack space

---

## Common Binary Search Patterns

- Search in rotated sorted array
- First and last occurrence
- Peak element
- Search space reduction problems
- Minimize / maximize problems

---

## Common Mistakes

- Incorrect mid calculation (overflow)
- Infinite loops due to wrong boundaries
- Off-by-one errors
- Incorrect termination conditions

---

## Time & Space Complexity

- **Time Complexity:** O(log n)
- **Space Complexity:** O(1) (iterative), O(log n) (recursive)

---

## When to Use Binary Search

- When data is sorted or monotonic
- When a problem asks for:
  - Minimum / maximum valid value
  - Earliest / latest occurrence
- When brute-force scanning is inefficient

---

## Key Insight

Binary Search is not just a search technique, but a **powerful optimization tool**.  
If a problem has a **monotonic answer space**, binary search can often be applied even if the data is not explicitly sorted.