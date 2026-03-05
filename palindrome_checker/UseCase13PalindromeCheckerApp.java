import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    // Simple palindrome algorithm (two-pointer approach)
    public static boolean isPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = isPalindrome(input);

        // Capture end time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time: " + executionTime + " ns");

        sc.close();
    }
}
