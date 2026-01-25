# Prefix Sum

**Prefix Sum** is a preprocessing technique used to efficiently compute **range queries** on arrays or matrices.  
It allows repeated sum calculations to be answered in constant time after linear preprocessing.

This section focuses on **prefix sum concepts, variations, and problem patterns** commonly used in interviews.

---

## What is Prefix Sum?

A prefix sum array stores the **cumulative sum** of elements up to each index.

For an array `arr`:
- `prefix[i]` = sum of elements from index `0` to `i`

Once built, range sums can be computed efficiently.

---

## Why Prefix Sum?

- Eliminates repeated summation
- Converts nested loops into constant-time queries
- Widely used in subarray and range-based problems

---

## Building Prefix Sum

- Initialize the first element
- Each next element is the sum of the previous prefix and current value
- Construction takes O(n) time

---

## Range Sum Query

Using prefix sum:
- Sum from index `l` to `r`:
  - `prefix[r] - prefix[l - 1]` (if `l > 0`)
  - `prefix[r]` (if `l == 0`)

---

## Variations of Prefix Sum

### 1. Prefix Sum with Hashing
- Used for subarray sum equals K
- Handles negative numbers efficiently

---

### 2. 2D Prefix Sum
- Used in matrices
- Answers submatrix sum queries in O(1)

---

### 3. Difference Array
- Reverse of prefix sum
- Efficient range updates

---

## Common Problem Patterns

- Subarray sum equals K
- Count subarrays with given sum
- Range sum queries
- Equilibrium index
- Maximum size subarray with sum constraint

---

## Time & Space Complexity

- **Preprocessing Time:** O(n)
- **Query Time:** O(1)
- **Space Complexity:** O(n)

---

## When to Use Prefix Sum

- When multiple range queries are required
- When subarray sums are involved
- When brute-force summation causes TLE

---

## Key Insight

Prefix sum shifts work from **query time to preprocessing time**.  
Once built, it allows fast and efficient range-based calculations with minimal overhead.