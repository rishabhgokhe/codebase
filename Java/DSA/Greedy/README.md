# Greedy

The **Greedy** approach is a problem-solving technique where a **locally optimal choice** is made at each step with the hope that it leads to a **globally optimal solution**.

This section focuses on understanding **greedy principles, correctness, and common problem patterns** used in interviews and competitive programming.

---

## What is Greedy?

A greedy algorithm makes a decision that seems best **at the current moment** without considering future consequences.  
Once a choice is made, it is **never reconsidered**.

Greedy solutions are typically simpler and faster than dynamic programming but require careful correctness reasoning.

---

## Key Characteristics

- Makes decisions step-by-step
- No backtracking
- Often combined with sorting
- Works only when the problem has the greedy-choice property

---

## Greedy-Choice Property

A problem has the greedy-choice property if:
- A globally optimal solution can be reached by making a locally optimal choice
- Early decisions do not block optimal future decisions

Not all problems satisfy this property.

---

## Common Greedy Techniques

### 1. Sorting-Based Greedy
- Sort data based on a key
- Make decisions in sorted order

---

### 2. Interval Scheduling
- Choose intervals with earliest finish time
- Maximizes number of non-overlapping intervals

---

### 3. Resource Allocation
- Assign resources optimally
- Minimize or maximize some quantity

---

### 4. Two-Pointer Greedy
- Uses pointers with greedy decisions
- Often used after sorting

---

## Common Greedy Problem Patterns

- Activity selection
- Job sequencing
- Minimum platforms
- Fractional knapsack
- Jump game
- Gas station problems

---

## Greedy vs Dynamic Programming

| Greedy | Dynamic Programming |
|------|--------------------|
| Faster | Slower |
| Simpler | More complex |
| No re-evaluation | Re-evaluates states |
| Not always correct | Always correct |

---

## Time & Space Complexity

- Time complexity depends on sorting: typically O(n log n)
- Space complexity is usually O(1) or O(n)

---

## When to Use Greedy

- When optimal substructure exists
- When decisions do not depend on future states
- When problem constraints allow monotonic choices

---

## Common Pitfalls

- Assuming greedy always works
- Not proving correctness
- Choosing the wrong greedy criterion

---

## Key Insight

Greedy algorithms work best when **the problem structure guarantees correctness of local decisions**.  
The hardest part is not coding, but identifying the **right greedy rule**.