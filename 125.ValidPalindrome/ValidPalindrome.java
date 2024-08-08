public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // Skip non-alphanumeric characters from the start
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            // Skip non-alphanumeric characters from the end
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            // Compare characters at the current pointers
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            // Move pointers inward
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Test cases
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(solution.isPalindrome("race a car")); // Output: false
        System.out.println(solution.isPalindrome(" ")); // Output: true
    }
}
