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
        String input = "level";

        System.out.println("=====Time comparisons=====\n");

        // Stack strategy
        System.out.println("Stack Strategy: ");
        PalindromeStrategy stackStrategy = new StackStrategy();
        long startTime = System.nanoTime();
        boolean stackResult = stackStrategy.checkPalindrome(input);
        long endTime = System.nanoTime();
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + stackResult);
        System.out.println("Time taken: "+(endTime-startTime));

        // Deque strategy
        System.out.println("Stack Strategy: ");
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        startTime = System.nanoTime();
        boolean dequeResult = dequeStrategy.checkPalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + dequeResult);
        System.out.println("Time taken: "+(endTime-startTime));


    }
}