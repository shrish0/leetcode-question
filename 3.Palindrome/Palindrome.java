class Palindrome {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        while (reversed < x) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return (x == reversed || x == reversed / 10);
    }

    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        
        // Test cases
        System.out.println(solution.isPalindrome(121)); // Output: true
        System.out.println(solution.isPalindrome(-121)); // Output: false
        System.out.println(solution.isPalindrome(10)); // Output: false
    }
}
