public class PalindromeCheckerApp {

    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {

        System.out.println("        " + APP_NAME);
        System.out.println("        " + APP_VERSION);
        System.out.println("Welcome to the Palindrome Checker Application!");
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Application Execution Completed.");
    }
}