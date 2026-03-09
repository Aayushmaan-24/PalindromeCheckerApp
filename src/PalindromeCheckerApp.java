import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "a man a plan a canal Panama";

        // Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start <= end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}