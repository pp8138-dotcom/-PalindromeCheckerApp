import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" Palindrome Checker App - UC12 (Strategy Pattern)");
        System.out.println("=================================================");

        String input = "madam";


        PalindromeStrategy strategy;


        strategy = new StackStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.check(input);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("=================================================");
        System.out.println("Program Ended.");
    }
}
interface PalindromeStrategy {
    boolean check(String str);
}
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String str) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}


class PalindromeService {

    private PalindromeStrategy strategy;


    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String str) {
        return strategy.check(str);
    }
}