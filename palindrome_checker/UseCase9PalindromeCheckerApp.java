inport java.util.Scanner;
public class UseCase9PanlindromeCheckerApp {
    public static boolean isPalindrome(String str, int start, int end) {
        // base case
        if(start >= end) {
            return true;
        }

        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome:\n");
        string input = sc.nextLine();
        if(isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The input string " + input + " is a palidrome\n");
        }
        else {
            System.out.println("The input string " + input + " is not a palindrome\n");
        }
        sc.close();
    }
}