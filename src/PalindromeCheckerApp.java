import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // -----------------------------
    // Algorithm 1: Stack-based
    // -----------------------------
    public static boolean stackPalindrome(String input) {
        input = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // -----------------------------
    // Algorithm 2: Deque-based
    // -----------------------------
    public static boolean dequePalindrome(String input) {
        input = input.toLowerCase().replaceAll("\\s+", "");
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // -----------------------------
    // Algorithm 3: Recursive
    // -----------------------------
    public static boolean recursivePalindrome(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return recursivePalindrome(input, start + 1, end - 1);
    }

    // -----------------------------
    // Algorithm 4: Iterative simple
    // -----------------------------
    public static boolean simplePalindrome(String input) {
        input = input.toLowerCase().replaceAll("\\s+", "");
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Palindrome Performance Comparison =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input for recursive method
        String normalizedInput = input.toLowerCase().replaceAll("\\s+", "");

        // -----------------------------
        // Stack-based timing
        // -----------------------------
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long stackTime = System.nanoTime() - startTime;

        // -----------------------------
        // Deque-based timing
        // -----------------------------
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long dequeTime = System.nanoTime() - startTime;

        // -----------------------------
        // Recursive timing
        // -----------------------------
        startTime = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(normalizedInput, 0, normalizedInput.length() - 1);
        long recursiveTime = System.nanoTime() - startTime;

        // -----------------------------
        // Iterative simple timing
        // -----------------------------
        startTime = System.nanoTime();
        boolean simpleResult = simplePalindrome(input);
        long simpleTime = System.nanoTime() - startTime;

        // -----------------------------
        // Display Results
        // -----------------------------
        System.out.println("\nAlgorithm Performance:");
        System.out.printf("Stack-based       : %d ns -> %s\n", stackTime, stackResult ? "Palindrome" : "Not Palindrome");
        System.out.printf("Deque-based       : %d ns -> %s\n", dequeTime, dequeResult ? "Palindrome" : "Not Palindrome");
        System.out.printf("Recursive         : %d ns -> %s\n", recursiveTime, recursiveResult ? "Palindrome" : "Not Palindrome");
        System.out.printf("Iterative Simple  : %d ns -> %s\n", simpleTime, simpleResult ? "Palindrome" : "Not Palindrome");

        scanner.close();
    }
}