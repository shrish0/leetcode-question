import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
    /*
    public static int romanToInt(String s) {
        // Using uppercase keys for the Roman numerals
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('M', 1000);
        hm.put('D', 500);
        hm.put('C', 100);
        hm.put('L', 50);
        hm.put('X', 10);
        hm.put('V', 5);
        hm.put('I', 1);

        int sum = 0;
        int prevValue = 0;

        // Iterate over the Roman numeral string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = hm.get(s.charAt(i));

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                // Otherwise, add the current value
                sum += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return sum;
    }
    */
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('M', 1000);
        hm.put('D', 500);
        hm.put('C', 100);
        hm.put('L', 50);
        hm.put('X', 10);
        hm.put('V', 5);
        hm.put('I', 1);

        int sum = 0;
        int prevValue = 0;

        // Iterate over the Roman numeral string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = hm.get(s.charAt(i));

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                // Otherwise, add the current value
                sum += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please Enter Roman Number For Conversion: ");
            String s = sc.next(); 
            System.out.println(s + " in Roman is: " + romanToInt(s));
        }
    }
}
