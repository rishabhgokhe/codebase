# Sliding Window

The **Sliding Window** technique is used to efficiently process **subarrays or substrings** by maintaining a window over a range of elements instead of recalculating results repeatedly.

It significantly reduces time complexity from **O(n²)** to **O(n)** for many range-based problems.

---

## What is Sliding Window?

A sliding window represents a **contiguous portion** of an array or string defined by two pointers:
- **Left pointer** (start of window)
- **Right pointer** (end of window)

The window moves across the data structure while maintaining required conditions.

---

## Types of Sliding Window

### 1. Fixed-Size Window
- Window size remains constant
- Used when the subarray or substring length is predefined

Examples:
- Maximum sum of subarray of size K
- Average of subarrays

---

### 2. Variable-Size Window
- Window size changes dynamically
- Used when constraints are based on conditions

Examples:
- Longest substring with at most K distinct characters
- Minimum window substring

---

## Core Sliding Window Operations

### Expand Window
- Move the right pointer forward
- Include new element into the window

### Shrink Window
- Move the left pointer forward
- Remove element from the window to restore validity

---

## Common Sliding Window Techniques

### 1. Frequency Tracking
- Uses hash map or array
- Tracks count of elements in the window

---

### 2. Condition-Based Window
- Expand until condition breaks
- Shrink until condition is satisfied again

---

### 3. Window Optimization
- Update result while expanding or shrinking
- Avoid recalculating window values

---

## Common Problem Patterns

- Maximum / minimum sum subarray
- Longest or shortest valid substring
- Subarrays with given sum or product
- Character frequency constraints
- Repeating character problems

---

## Time & Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1) or O(k) depending on frequency storage

---

## When to Use Sliding Window

- When dealing with **contiguous** subarrays or substrings
- When brute-force range checks are too slow
- When constraints depend on a moving range

---

## Key Insight

The sliding window technique works because **each element enters and leaves the window at most once**.  
Recognizing this pattern is the key to solving many range-based problems efficiently.