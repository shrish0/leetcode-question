import java.util.Scanner;

public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Handle null or empty input
        }

        int minStringLength = strs[0].length();
        for (String s : strs) {
            if (minStringLength > s.length()) {
                minStringLength = s.length(); // Find the shortest string length
            }
        }

        if (minStringLength == 0) {
            return ""; // If any string is empty, return an empty string
        }

        for (int i = 0; i < minStringLength; i++) {
            char tempChar = strs[0].charAt(i);
            for (String s : strs) {
                if (tempChar != s.charAt(i)) {
                    return strs[0].substring(0, i); // Return the common prefix so far
                }
            }
        }

        return strs[0].substring(0, minStringLength); // Return the whole string if it matches all
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for the number of strings
        System.out.print("Enter number of strings: ");
        int numberOfInput = sc.nextInt();
        sc.nextLine();  // Consume the newline left by nextInt()

        // Declare an array to store the strings
        String[] strs = new String[numberOfInput];

        // Prompt and read the strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < numberOfInput; i++) {
            strs[i] = sc.nextLine(); // Read each string
        }

        // Create an instance of LongestPrefix and call the method
        LongestPrefix lp = new LongestPrefix();
        String result = lp.longestCommonPrefix(strs);

        // Output the result
        System.out.println("Longest Common Prefix: " + result);
        
        sc.close(); // Close the scanner to avoid resource leak
    }
}
