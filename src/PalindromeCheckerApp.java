public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC3");
        System.out.println("----------------------------------");
        String original = "level";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
        System.out.println("----------------------------------");
        System.out.println("Program Ended.");
    }
}