import java.util.Scanner;

public class PalindromeCheckerApp {

    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {

        // UC1 – Welcome Message
        System.out.println("        " + APP_NAME);
        System.out.println("        " + APP_VERSION);
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("-------------------------------------");

        // UC2 – Hardcoded Palindrome
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("UC2 Result: \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("UC2 Result: \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");

        // UC3 – Palindrome Using String Reverse
        String original = "level";
        String reverseString = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverseString = reverseString + original.charAt(i);
        }

        if (original.equals(reverseString)) {
            System.out.println("UC3 Result: \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("UC3 Result: \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");

        // UC4 – Character Array Based Palindrome Check
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string for UC4 (char array method): ");
        String userInput = scanner.nextLine();
        char[] chars = userInput.toCharArray();

        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("UC4 Result: \"" + userInput + "\" is a Palindrome.");
        } else {
            System.out.println("UC4 Result: \"" + userInput + "\" is NOT a Palindrome.");
        }

        scanner.close();

        System.out.println("-------------------------------------");
        System.out.println("Application Execution Completed.");
    }
}