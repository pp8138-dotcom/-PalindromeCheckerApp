import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC4");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String reversed = "";

        for(int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if(original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        sc.close();
    }
}