import java.util.Scanner;

public class LastWordLength {

    // Method to find the length of the last word in a string using a pointer approach
    public static int lastWordLength(String s) {
        int i = s.length() - 1; // Start from the end of the string
        int length = 0;

        // Skip any trailing spaces by moving left until a non-space character is found
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word by moving left until a space is found
        while (i >= 0 && s.charAt(i) != ' ') {
            length++; // Increment length for each character in the last word
            i--;
        }

        return length; // Return the length of the last word
    }

    /*
    // Another solution using trimming and substring
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove any leading or trailing spaces
        int l = s.lastIndexOf(' '); // Find the index of the last space
        String str = s.substring(l + 1); // Extract the last word from the string
        return str.length(); // Return the length of the last word
    }
    
    // Another solution using a loop and checking characters from the end
    public static int lastWordLength(String s) {
        String str = s.trim(); // Trim any leading or trailing spaces
        int count = 0;
        
        // Traverse the string from the end, counting characters until a space is found
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++; // Count characters of the last word
            } else {
                break; // Stop when a space is encountered
            }
        }
        
        return count; // Return the length of the last word
    }
    */

    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String s = sc.nextLine();

        // Call the method to calculate the length of the last word
        int length = lastWordLength(s);

        // Output the result
        System.out.println("Length of the last word: " + length);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
