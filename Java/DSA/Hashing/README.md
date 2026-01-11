# Hashing

**Hashing** is a technique used to store and retrieve data efficiently using a **key–value mapping**.  
It enables average constant-time operations and is widely used to optimize search, count, and lookup problems.

This section focuses on **hashing concepts, data structures, and common problem patterns** used in interviews and competitive programming.

---

## What is Hashing?

Hashing converts a key into an index using a **hash function**.  
The computed index is used to store or retrieve the value from a hash table.

The goal of hashing is to achieve **fast access** without scanning the entire data set.

---

## Hash Function

A **hash function**:
- Takes a key as input
- Produces a fixed-range integer (hash code)
- Distributes keys uniformly to minimize collisions

A good hash function reduces clustering and improves performance.

---

## Hash Table

A **Hash Table** is a data structure that stores key–value pairs using hashing.

### Common Implementations
- Arrays + hashing logic
- Built-in hash maps / hash sets

---

## Collision Handling Techniques

### 1. Chaining
- Each index stores a list of elements
- Multiple keys can map to the same index

### 2. Open Addressing
- Finds another empty slot on collision
- Linear probing, quadratic probing, or double hashing

---

## Common Hashing Data Structures

### HashMap
- Stores key–value pairs
- Allows fast lookup, insertion, and deletion

### HashSet
- Stores unique elements only
- Used for duplicate detection

---

## Common Hashing Techniques

### 1. Frequency Counting
- Count occurrences of elements
- Used in majority, anagram, and counting problems

---

### 2. Lookup Optimization
- Replace nested loops with hash lookups
- Reduces time complexity from O(n²) to O(n)

---

### 3. Prefix Hashing
- Used in strings and subarray problems
- Enables fast comparisons

---

### 4. Two-Sum Style Problems
- Uses hash map to track required complements

---

## Common Problem Patterns

- Detect duplicates
- Find first unique element
- Count frequency of elements
- Subarray sum equals K
- Anagram checking
- Longest consecutive sequence

---

## Time & Space Complexity

| Operation | Average | Worst Case |
|----------|---------|------------|
| Insert   | O(1)    | O(n)       |
| Search   | O(1)    | O(n)       |
| Delete   | O(1)    | O(n)       |

Worst-case occurs due to excessive collisions.

---

## When to Use Hashing

- When fast lookup is required
- When order is not important
- When optimizing brute-force solutions
- When tracking frequency or presence

---

## Key Insight

Hashing is one of the most powerful optimization tools in DSA.  
If a problem involves **searching, counting, or pairing**, hashing is often the first technique to consider.