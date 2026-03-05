import java.util.Scanner;

public class CaseInsensitivePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Normalize the string
        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        // Convert to character array
        char[] arr = input.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // Compare characters from both ends
        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
