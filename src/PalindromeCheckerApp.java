import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC5 (Stack Based)");
        System.out.println("-------------------------------------------");

        String original = "madam";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------------");
        System.out.println("Program Ended.");
    }
}