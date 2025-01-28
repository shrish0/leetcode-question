
# Length of Longest Substring Without Repeating Characters

This project solves the problem of finding the length of the longest substring without repeating characters using an efficient **sliding window technique** combined with a **HashSet**.

---

## Problem Description

Given a string `s`, the task is to determine the length of the longest substring without repeating characters. A substring is a contiguous sequence of characters within the string.

### Examples
1. **Input:** `"abcabcbb"`  
   **Output:** `3`  
   **Explanation:** The longest substring without repeating characters is `"abc"`.

2. **Input:** `"bbbbb"`  
   **Output:** `1`  
   **Explanation:** The longest substring without repeating characters is `"b"`.

3. **Input:** `"pwwkew"`  
   **Output:** `3`  
   **Explanation:** The longest substring without repeating characters is `"wke"`. Note that `"pwke"` is not a valid substring as it is not contiguous.

4. **Input:** `""`  
   **Output:** `0`  
   **Explanation:** An empty string has a length of 0.

---

## Approach

This solution uses the **sliding window technique**, which dynamically adjusts the size of a substring by maintaining a range of valid characters.

### Key Steps

1. **Use a Sliding Window:**  
   Two pointers, `i` (start) and `j` (end), are used to represent the boundaries of the window. The substring within these boundaries always contains unique characters.

2. **HashSet for Character Tracking:**  
   A `HashSet` is used to store characters in the current substring. This allows for constant-time checks to determine whether a character is already present.

3. **Iterate Over the String:**  
   - For each character in the string, check if it is already in the `HashSet`.
   - If the character is not in the `HashSet`, add it and calculate the window's length.
   - If the character is already in the `HashSet`, slide the start pointer (`i`) forward and remove characters from the `HashSet` until the duplicate is removed.

4. **Update the Result:**  
   Keep track of the maximum length of the substring encountered so far.

---

## Code

```java
import java.util.HashSet;

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;

        HashSet<Character> set = new HashSet<>();
        int j = 0, result = 0;

        for (int i = 0; i < s.length(); i++) {
            // If the character is already in the set, slide the window
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j++));
            }

            // Add the current character to the set
            set.add(s.charAt(i));

            // Update the result with the maximum length
            result = Math.max(result, i - j + 1);
        }

        return result;
    }
}
```

---

## Complexity Analysis

1. **Time Complexity:**  
   - Each character is added to and removed from the `HashSet` at most once.
   - This results in a time complexity of **O(n)**, where `n` is the length of the string.

2. **Space Complexity:**  
   - The space complexity is **O(k)**, where `k` is the size of the character set. For ASCII characters, `k` is constant (128).

---

## Edge Cases

1. **Empty String:**  
   - Input: `""`  
   - Output: `0`  

2. **String with One Character:**  
   - Input: `"a"`  
   - Output: `1`  

3. **String with All Repeating Characters:**  
   - Input: `"aaaaa"`  
   - Output: `1`  

4. **String with All Unique Characters:**  
   - Input: `"abcdef"`  
   - Output: `6`  

---

## Key Takeaways

- The **sliding window technique** is a powerful method for solving substring problems efficiently.
- Using a `HashSet` allows for constant-time lookups and simplifies the logic for handling duplicate characters.
- The solution is optimized for both time and space complexity, making it suitable for long input strings.

--- 
