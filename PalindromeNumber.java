public class PalindromeNumber {
    public int reverseNumber(int x) {
        int reverse = 0;
        while (x > 0) {
            int remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x / 10;
        }
        return reverse;
    }
    public boolean isPalindrome(int x) {
        int reverse = reverseNumber(x);
        if (reverse == x) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();

        System.out.println("9. Palindrome Number\nExample 1:");
        int num1 = 121;
        System.out.println("Input: " + num1);
        System.out.println("Output: " + solution.isPalindrome(num1) + "\n");

        System.out.println("Example 2:");
        int num2 = -121;
        System.out.println("Input: " + num2);
        System.out.println("Output: " + solution.isPalindrome(num2) + "\n");

        System.out.println("Example 3:");
        int num3 = 10;
        System.out.println("Input: " + num3);
        System.out.println("Output: " + solution.isPalindrome(num3) + "\n");

        System.out.println("Example 4:");
        int num4 = 10101;
        System.out.println("Input: " + num4);
        System.out.println("Output: " + solution.isPalindrome(num4) + "\n");

    }
}
