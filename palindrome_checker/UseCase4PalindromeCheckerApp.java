import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome\n");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        char charArray[] = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while(start < end) {
            if(charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome) {
            System.out.println("The entered string " + input + " is a palindrome\n");
        }
        else {
            System.out.println("The entered string " + input + " is not a palindrome\n");
        }
    }
}