import java.util.*;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}