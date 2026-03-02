public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" Palindrome Checker App - UC11 (OOP Version)");
        System.out.println("==============================================");

        String input = "madam";
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        System.out.println("==============================================");
        System.out.println("Program Ended.");
    }
}
class PalindromeChecker {

    public boolean checkPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}