# Stack

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
This section focuses on understanding **stack behavior, core operations, and problem-solving patterns** commonly asked in interviews.

Stacks are widely used to manage **order, reversals, and nested structures** efficiently.

---

## What is a Stack?

A stack allows insertion and removal of elements from **only one end**, called the **top** of the stack.  
The last element added is the first one to be removed.

---

## Core Stack Operations

### Push
- Inserts an element at the top of the stack

### Pop
- Removes and returns the top element

### Peek / Top
- Returns the top element without removing it

### IsEmpty
- Checks whether the stack is empty

---

## Stack Implementation

Stacks can be implemented using:
- Arrays
- Linked Lists
- Built-in stack libraries

Each implementation has trade-offs in terms of memory and flexibility.

---

## Common Stack Techniques

### 1. Expression Evaluation
- Infix, Prefix, and Postfix expressions
- Operator precedence handling

---

### 2. Parentheses & Bracket Validation
- Used to check balanced symbols
- Relies on matching pairs

---

### 3. Monotonic Stack
- Maintains increasing or decreasing order
- Used for range-based problems

---

### 4. Stack for Reversal
- Reversing strings, arrays, or sequences
- Uses LIFO nature directly

---

### 5. Recursion to Stack Conversion
- Replaces recursive calls with explicit stack usage
- Helps avoid stack overflow

---

## Common Problem Patterns

- Next Greater / Smaller Element
- Valid parentheses
- Stock span problems
- Undo / Redo operations
- Function call simulation
- Expression parsing

---

## Time & Space Complexity

| Operation | Complexity |
|----------|------------|
| Push     | O(1)       |
| Pop      | O(1)       |
| Peek    | O(1)       |

Auxiliary space depends on the problem and input size.

---

## When to Use Stack

- When order matters and needs reversal
- When processing nested or hierarchical data
- When tracking previous states or elements
- When recursion behavior is required

---

## Key Insight

Stacks simplify problems where **the most recent element must be processed first**.  
Recognizing LIFO behavior in a problem often leads directly to a stack-based solution.