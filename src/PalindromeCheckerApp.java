public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   Palindrome Checker App - UC9");
        System.out.println("=====================================");

        String original = "madam";

        boolean result = isPalindrome(original, 0, original.length() - 1);

        if (result) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program Ended.");
    }


    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
}