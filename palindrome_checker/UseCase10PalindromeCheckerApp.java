import java.util.*;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Normalize string
        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int left = 0;
        int right = input.length() - 1;

        // Compare characters
        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
