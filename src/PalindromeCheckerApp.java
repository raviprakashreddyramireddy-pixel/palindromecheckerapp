import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String input) {
        // Normalize string: remove spaces and convert to lowercase
        input = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = input.length() - 1;

        // Compare characters from start and end
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Case-Insensitive & Space-Ignored Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}