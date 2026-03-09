import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "a man a plan a canal Panama";

        // Normalize string
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = cleaned.length() - 1;

        boolean isPalindrome = true;

        while (start <= end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
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