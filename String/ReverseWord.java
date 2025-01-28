import java.util.Scanner;

public class ReverseWord {

    //using char array
    public static String reverseWords(String s) {
        // Remove leading and trailing spaces
        s = s.trim();

        // Convert the string into a character array
        char[] chars = s.toCharArray();
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        // Traverse the array in reverse
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                word.append(chars[i]);
            } else if (word.length() > 0) {
                result.append(word.reverse().toString()); 
                result.append(" "); 
                word.setLength(0);  
            }
        }
        if (word.length() > 0) {
            result.append(word.reverse().toString());
        }
        return result.toString().trim(); 
    }
    
    //using trim and split
    /* 
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String below");
        String str = sc.nextLine();
        System.out.println("Reversed String");
        System.out.println(reverseWords(str));
    }
}
