# Dynamic Programming (DP)

**Dynamic Programming (DP)** is an optimization technique used to solve problems by breaking them into **overlapping subproblems** and storing their results to avoid redundant computations.

This section focuses on understanding **DP fundamentals, problem patterns, and solution methods** commonly used in interviews and competitive programming.

---

## What is Dynamic Programming?

Dynamic Programming is applicable when a problem has:
1. **Optimal Substructure**  
   The solution of a problem can be constructed from solutions of its subproblems.
2. **Overlapping Subproblems**  
   The same subproblems are solved multiple times.

DP trades **extra space** for **reduced time complexity**.

---

## Approaches in Dynamic Programming

### 1. Top-Down (Memoization)
- Uses recursion + cache
- Stores results of subproblems
- Avoids repeated calculations

### 2. Bottom-Up (Tabulation)
- Builds solutions iteratively
- Starts from base cases
- Generally more space-efficient than recursion

---

## Core Components of DP

### State
- Represents the subproblem
- Usually defined by indices or parameters

### Transition
- Relation between current state and previous states

### Base Case
- Smallest valid subproblem
- Prevents infinite recursion

### Final Answer
- Extracted from the DP table or final state

---

## Common DP Problem Patterns

### 1. 1D DP
- Fibonacci
- Climbing stairs
- House robber

---

### 2. 2D DP
- Grid-based problems
- Longest Common Subsequence (LCS)
- Knapsack problems

---

### 3. Subset / Knapsack Pattern
- 0/1 Knapsack
- Partition problems
- Target sum

---

### 4. String DP
- Palindrome problems
- Edit distance
- Pattern matching

---

### 5. Interval DP
- Matrix chain multiplication
- Burst balloons
- Partitioning problems

---

## Optimization Techniques

- **Space Optimization**
  - Reducing DP arrays to rolling variables
- **State Compression**
  - Using bitmasking
- **Greedy + DP**
  - Combining strategies for efficiency

---

## Time & Space Complexity

- Time complexity depends on:
  - Number of states
  - Transitions per state
- Space complexity depends on:
  - DP table size
  - Optimization applied

---

## When to Use Dynamic Programming

- When recursion causes repeated calculations
- When brute-force is too slow
- When a problem can be expressed as smaller subproblems

---

## Key Insight

Dynamic Programming is less about memorizing solutions and more about **identifying states and transitions**.  
Once the state is correctly defined, the solution usually follows naturally.