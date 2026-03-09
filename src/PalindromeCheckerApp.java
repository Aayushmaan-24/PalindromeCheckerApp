import java.util.*;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input, int start, int end) {
        if (start >= end) {
            return true; // base condition
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return isPalindrome(input, start + 1, end - 1); // recursive call
    }

    public static void main(String[] args) {
        String input = "madam";

        boolean isPalin = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalin);
    }
}