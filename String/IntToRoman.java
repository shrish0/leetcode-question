import java.util.Scanner;

public class IntToRoman {

    // Method to convert an integer to a Roman numeral
    public static String intToRoman(int number) {
        // Roman numeral symbols and their corresponding integer values
        String[] RomanCode = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] NumCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        // StringBuilder to construct the Roman numeral result
        StringBuilder s = new StringBuilder();
        int i = 0; // Index for traversing through RomanCode and NumCode arrays
        
        // Loop to convert the integer number to Roman numeral
        while (number > 0) {
            // While the number is greater than or equal to the current Roman numeral value
            while (number >= NumCode[i]) {
                // Subtract the value from the number and append the corresponding Roman numeral to the result
                number = number - NumCode[i];
                s.append(RomanCode[i]);
            }
            // Move to the next Roman numeral
            i++;
        }
        
        // Return the final Roman numeral as a string
        return s.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number for conversion
        System.out.print("Please Enter Number For Conversion: ");
        int number = sc.nextInt(); // Read the integer input
        
        // Convert the number to Roman numeral and display the result
        System.out.println(number + " Roman Equivalent: " + intToRoman(number));
        
        // Close the scanner to avoid resource leak
        sc.close();
    }
}
