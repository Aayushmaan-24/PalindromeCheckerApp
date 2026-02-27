public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        boolean flag = true;
        for (int i = 0; i<input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}