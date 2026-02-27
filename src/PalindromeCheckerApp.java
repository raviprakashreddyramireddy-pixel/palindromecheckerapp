import java.util.Scanner;

// PalindromeChecker class encapsulates all palindrome logic
class PalindromeChecker {

    private String input;

    // Constructor to initialize input
    public PalindromeChecker(String input) {
        this.input = input;
    }

    // Method to check if the input is a palindrome
    public boolean checkPalindrome() {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Normalize input: lowercase and remove spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Object-Oriented Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Use the class method to check palindrome
        if (checker.checkPalindrome()) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}