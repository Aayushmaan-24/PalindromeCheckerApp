import java.util.*;

public class PalindromeCheckerApp {
    /**
     * Application entry point that checks whether the hard-coded string "madam" is a palindrome and prints the input and the palindrome result.
     */
    public static void main(String[] args) {
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()){
            list.add(c);   // add characters to linked list
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}