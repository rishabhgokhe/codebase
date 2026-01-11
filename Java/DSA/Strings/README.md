# Strings

A **String** is a sequence of characters used to represent text.  
String-based problems focus on **pattern recognition, traversal, and efficient manipulation** of characters.

This section covers **core string concepts, common techniques, and problem patterns** frequently asked in interviews and competitive programming.

---

## What is a String?

A string is an indexed collection of characters stored in memory.  
In most programming languages, strings are **immutable**, meaning their content cannot be modified directly.

---

## Key Properties

- Ordered sequence of characters
- Zero-based indexing
- Often immutable
- Supports comparison and slicing operations

---

## Common String Techniques

### 1. Character Traversal
- Iterate over characters
- Used for basic counting and validation

---

### 2. Two Pointers
- Compare characters from both ends
- Used in palindrome and reversal problems

---

### 3. Sliding Window
- Maintains a window over the string
- Used in substring and frequency problems

---

### 4. Hashing in Strings
- Uses hash maps or frequency arrays
- Efficient for anagrams and duplicate detection

---

### 5. String Matching Algorithms
- Pattern searching within a text
- Improves naive matching approaches

---

### 6. Prefix-Based Techniques
- Prefix arrays or prefix functions
- Used for fast comparisons

---

## Common String Problem Patterns

- Palindrome checking
- Anagram detection
- Substring search
- Longest common prefix
- Longest repeating substring
- String rotation and shifts

---

## Important Algorithms

- Naive pattern matching
- KMP (Knuth–Morris–Pratt)
- Rabin–Karp
- Z-Algorithm

---

## Time & Space Complexity

- Traversal: O(n)
- Substring operations: O(n)
- Pattern matching: O(n + m)

---

## When to Use String Techniques

- When working with text-based data
- When order and pattern matter
- When frequency and matching are involved
- When brute-force comparisons are inefficient

---

## Key Insight

Most string problems can be solved efficiently by combining **sliding window, hashing, and two-pointer techniques**.  
Understanding how characters interact within a window is the key to mastering strings.