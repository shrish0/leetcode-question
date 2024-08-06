
## Explanation

The `TwoSum` program solves the two-sum problem using a `HashMap` to efficiently find two numbers in an array that add up to a specified target value.

### How It Works

1. **Initialize HashMap**: Create a `HashMap` to store each number from the array and its index as you iterate through the array.

2. **Iterate Through Array**: For each number in the array:
   - Calculate its complement, which is the difference between the target value and the current number (`complement = target - nums[i]`).
   - Check if the complement exists in the `HashMap`.
     - If it does, you have found the pair of indices that sum up to the target value.
     - If it doesn’t, add the current number and its index to the `HashMap`.

3. **Return Result**: If a pair is found, return their indices. If no such pair exists by the end of the array, return `[-1, -1]`.

### HashMap Usage

- **Storage**: The `HashMap` is used to store numbers as keys and their indices as values.
- **Lookup**: Checking if the complement of the current number exists in the `HashMap` allows for quick determination of whether a valid pair has been found.

By using a `HashMap`, the program achieves a time complexity of \(O(n)\), making it more efficient compared to the naive \(O(n^2)\) approach of using nested loops.

---

This explanation highlights the use of `HashMap` and how it contributes to the efficiency of the solution.

### Explanation of HashMap

A `HashMap` in Java is a data structure that allows you to store key-value pairs and provides efficient retrieval of values based on their keys. Here’s a breakdown of how it works:

#### Key Features

1. **Storage**: 
   - **Key-Value Pairs**: A `HashMap` stores data as key-value pairs. Each key is unique, and each key maps to exactly one value.
   - **Hashing**: Internally, `HashMap` uses a hashing mechanism to store keys in buckets, which allows for quick access to values.

2. **Time Complexity**:
   - **Average Case**: The time complexity for basic operations like insertion, deletion, and lookup is \(O(1)\) on average, due to the hash-based indexing.
   - **Worst Case**: In rare scenarios where many keys hash to the same bucket, operations can degrade to \(O(n)\), but this is uncommon with a good hash function and balanced buckets.

3. **Ordering**:
   - **Unordered**: `HashMap` does not maintain the order of elements. The order in which elements are stored is not guaranteed and can vary.

#### Basic Operations

- **Insertion**: You can add a key-value pair to the `HashMap` using the `put` method:
  ```java
  map.put(key, value);
  ```

- **Retrieval**: You can retrieve a value based on its key using the `get` method:
  ```java
  value = map.get(key);
  ```

- **Check Presence**: You can check if a key exists in the `HashMap` using the `containsKey` method:
  ```java
  boolean exists = map.containsKey(key);
  ```

- **Deletion**: You can remove a key-value pair from the `HashMap` using the `remove` method:
  ```java
  map.remove(key);
  ```

