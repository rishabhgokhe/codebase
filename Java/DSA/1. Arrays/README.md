# Arrays

Arrays are one of the most fundamental data structures in computer science.  
This section focuses on **core array concepts, techniques, and patterns** that are frequently used in coding interviews and competitive programming.

The aim is to move beyond brute-force thinking and develop **efficient problem-solving intuition** using arrays.

---

## What is an Array?

An **Array** is a data structure that stores elements of the same type in **contiguous memory locations**.  
Each element can be accessed directly using its index, enabling constant-time access.

---

## Key Properties

- Fixed size (in most languages)
- Zero-based indexing
- Fast random access
- Cache-friendly due to contiguous memory

---

## Common Array Techniques

### 1. Traversal
- Iterating through elements using loops
- Used in almost every array problem

---

### 2. Prefix Sum
- Precomputes cumulative sums
- Helps answer range queries in O(1)

---

### 3. Sliding Window
- Maintains a window over the array
- Used for subarray and range problems

---

### 4. Two Pointers
- Uses two indices moving towards each other or in the same direction
- Reduces time complexity in sorted or constrained problems

---

### 5. Sorting-Based Techniques
- Sort first, then apply logic
- Often combined with two pointers or binary search

---

### 6. Hashing with Arrays
- Uses auxiliary arrays or hash maps
- Tracks frequency, presence, or mapping

---

### 7. In-Place Modification
- Solves problems without extra space
- Important for space-optimized solutions

---

## Common Problem Patterns

- Subarray sum / product
- Maximum / minimum in a range
- Rearrangement problems
- Frequency counting
- Merging intervals
- Rotations and shifts
- Duplicate and missing elements

---

## Time & Space Complexity

| Operation        | Complexity |
|------------------|------------|
| Access           | O(1)       |
| Search (linear)  | O(n)       |
| Insert/Delete    | O(n)       |

---

## When to Use Arrays

- When fast indexing is required
- When memory layout matters
- As a base structure for:
  - Strings
  - Matrices
  - Sliding window problems
  - Stack & queue implementations

---

## Key Insight

Most array problems are not about the array itself, but about **recognizing the right pattern**  
(prefix sums, two pointers, sliding window, etc.) and applying it efficiently.