import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";
        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);     // FIFO
            stack.push(c);    // LIFO
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare until queue becomes empty
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();   // front
            char fromStack = stack.pop();      // top

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}