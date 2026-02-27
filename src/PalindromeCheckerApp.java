import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        // Create Queue (FIFO)
        Deque<Character> deque = new ArrayDeque<>();

        // Create Stack (LIFO)
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            // Remove from both ends
            char first = deque.removeFirst();
            char last = deque.removeLast();

            // If characters don't match, it's not a palindrome
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}