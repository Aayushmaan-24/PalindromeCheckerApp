import java.util.*;

// Strategy interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Stack strategy
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        Stack<Character> s = new Stack<>();
        for (char c : input.toCharArray())
            s.push(c);
        for (char c : input.toCharArray())
            if (s.pop() != c)
                return false;
        return true;
    }
}

// Deque strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : input.toCharArray())
            dq.add(c);
        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast())
                return false;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";  // You can test with longer strings for better performance comparison

        // List of strategies to compare
        Map<String, PalindromeStrategy> strategies = new LinkedHashMap<>();
        strategies.put("Stack Strategy", new StackStrategy());
        strategies.put("Deque Strategy", new DequeStrategy());

        // Run each strategy, capture execution time, and display results
        System.out.println("=== Palindrome Performance Comparison ===");
        for (Map.Entry<String, PalindromeStrategy> entry : strategies.entrySet()) {
            String name = entry.getKey();
            PalindromeStrategy strategy = entry.getValue();

            long startTime = System.nanoTime();
            boolean result = strategy.checkPalindrome(input);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println(name + ":");
            System.out.println("Input: " + input);
            System.out.println("Is Palindrome: " + result);
            System.out.println("Execution Time (ns): " + duration);
            System.out.println("-------------------------------------");
        }
    }
}