
# Add Two Numbers

## Problem Description

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

### Examples

1. **Example 1:**
   - **Input:** l1 = [2, 4, 3], l2 = [5, 6, 4]
   - **Output:** [7, 0, 8]
   - **Explanation:** 342 + 465 = 807.

2. **Example 2:**
   - **Input:** l1 = [0], l2 = [0]
   - **Output:** [0]

3. **Example 3:**
   - **Input:** l1 = [9, 9, 9, 9, 9, 9, 9], l2 = [9, 9, 9, 9]
   - **Output:** [8, 9, 9, 9, 0, 0, 0, 1]
   - **Explanation:** 9999999 + 9999 = 10009998.

## Approach

The problem is solved using the following approach:

1. **Initialization**:
   - Use a dummy node to simplify operations and handle the result list. This dummy node helps in easily returning the head of the resulting linked list.

2. **Traversal and Addition**:
   - Traverse both linked lists node by node.
   - For each pair of nodes, add their values along with any carry from the previous addition.
   - Create a new node with the result of this addition (modulo 10) and update the carry (integer division by 10).
   - Move to the next nodes in both lists.

3. **Handle Remaining Carry**:
   - After traversing both lists, if there is any carry left, create a new node with this carry value.

4. **Return Result**:
   - Return the node following the dummy node, which is the head of the actual result list.
   
## Summary

### Time Complexity: 
   - O(n), where n is the length of the longer of the two linked lists.
### Space Complexity: 
   - O(n), where n is the length of the longer of the two linked lists.

## Constraints

- The number of nodes in each linked list is in the range [1, 100].
- Node values are between 0 and 9.
- No leading zeros are present in the input lists, except for the number 0 itself.

---