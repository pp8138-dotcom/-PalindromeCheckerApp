public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" Palindrome Checker App - UC10");
        System.out.println("==============================================");

        String original = "Madam In Eden Im Adam";


        String normalized = original
                .toLowerCase()                 // ignore case
                .replaceAll("\\s+", "");       // remove spaces

        boolean isPalindrome = true;

        int left = 0;
        int right = normalized.length() - 1;


        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a Palindrome (ignoring case & spaces).");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("==============================================");
        System.out.println("Program Ended.");
    }
}