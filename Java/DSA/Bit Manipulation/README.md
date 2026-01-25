# Bit Manipulation

**Bit Manipulation** is a technique that directly operates on the **binary representation** of numbers.  
It enables highly efficient solutions by using bitwise operations instead of arithmetic or loops.

This section focuses on **bitwise fundamentals, common tricks, and problem patterns** frequently asked in interviews.

---

## What is Bit Manipulation?

Every integer is stored in binary form.  
Bit manipulation involves modifying or querying individual bits using **bitwise operators**.

It is widely used for:
- Optimization
- Space-efficient solutions
- Low-level operations

---

## Bitwise Operators

| Operator | Name | Description |
|--------|------|------------|
| `&` | AND | Sets bit if both bits are 1 |
| `|` | OR | Sets bit if at least one bit is 1 |
| `^` | XOR | Sets bit if bits are different |
| `~` | NOT | Inverts all bits |
| `<<` | Left Shift | Shifts bits left |
| `>>` | Right Shift | Shifts bits right |

---

## Common Bit Manipulation Techniques

### 1. Check if a Bit is Set
- Use AND with a mask

---

### 2. Set / Clear / Toggle a Bit
- Modify specific bits using OR, AND, XOR

---

### 3. Check Even or Odd
- Use AND with 1

---

### 4. Count Set Bits
- Brian Kernighan’s algorithm
- Built-in bit count functions

---

### 5. Power of Two Check
- Number with only one set bit

---

### 6. XOR-Based Tricks
- Find unique elements
- Swap numbers without extra space

---

## Common Problem Patterns

- Single number problems
- Find missing or duplicate number
- Subsets using bitmasking
- Gray code
- Bitwise AND / OR range problems

---

## Bitmasking

- Represents subsets using bits
- Efficient for small constraint problems
- Common in DP and combinatorics

---

## Time & Space Complexity

- Bitwise operations run in **O(1)**
- Space usage is minimal

---

## When to Use Bit Manipulation

- When constraints are tight
- When dealing with subsets or toggles
- When arithmetic operations are too slow
- When memory optimization is required

---

## Common Pitfalls

- Operator precedence errors
- Signed vs unsigned shifts
- Overflow issues

---

## Key Insight

Bit manipulation works at the **lowest level of data representation**.  
Once understood, it provides some of the fastest and most elegant solutions in DSA.