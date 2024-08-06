### README

# Palindrome Number Checker

This Java program checks whether a given integer is a palindrome. A palindrome number is a number that reads the same backward as forward.

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome integer.

**Example 1:**

- **Input:** `x = 121`
- **Output:** `true`
- **Explanation:** 121 reads as 121 from left to right and from right to left.

**Example 2:**

- **Input:** `x = -121`
- **Output:** `false`
- **Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.

**Example 3:**

- **Input:** `x = 10`
- **Output:** `false`
- **Explanation:** Reads 01 from right to left. Therefore, it is not a palindrome.

**Constraints:**

- `-2^31 <= x <= 2^31 - 1`

## Solution Explanation

### Approach

The approach involves reversing half of the digits of the integer and comparing them with the remaining half. This method avoids potential integer overflow issues that might occur with the full reverse method and optimizes the space complexity.

### Steps

1. **Handle Special Cases**:
   - If `x` is negative or ends in zero (but is not zero), it cannot be a palindrome.
2. **Reverse Half of the Number**:
   - Extract the last digit of `x` and append it to `reversed`.
   - Remove the last digit from `x`.
   - Stop the loop when `x` is less than or equal to `reversed`.
3. **Compare the Halves**:
   - If the original number's length is odd, the middle digit can be discarded by dividing `reversed` by 10.
   - Check if the original first half (`x`) is equal to the reversed second half (`reversed`).

### Complexity Analysis

- **Time Complexity**: \(O(\log_{10} n)\)
  - The number of digits in the integer is proportional to \( \log_{10} n \). The loop runs for half the number of digits, so the time complexity is \(O(\log_{10} n)\).

- **Space Complexity**: \(O(1)\)
  - The space complexity is \(O(1)\) because only a fixed amount of extra space is used for the variables `reversed` and `digit`.


### Explanation of the Code

1. **Initialization**: Initialize `reversed` to 0.
2. **Special Cases**: Return `false` for negative numbers and numbers ending in zero (but not zero itself).
3. **Reversing Half the Number**:
   - Use a loop to reverse the digits of the second half of the number.
   - Extract the last digit of `x` using `x % 10` and add it to `reversed`.
   - Remove the last digit from `x` by dividing it by 10.
   - Continue this process until `reversed` is greater than or equal to `x`.
4. **Comparing the Halves**:
   - Compare `x` and `reversed` to check if the number is a palindrome.
   - If the original number has an odd number of digits, divide `reversed` by 10 to remove the middle digit before comparison.

This approach ensures efficient and correct palindrome checking with optimal time and space complexity.