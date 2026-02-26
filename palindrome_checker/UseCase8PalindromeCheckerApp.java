// check palindrome using singly linked list in java
import java.util.LinkedList;
import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        for(char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;
        while(list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if(Character.toLowerCase(first) != Character.toLowerCase(last)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("The entered string " + input + " is a palindrome\n");
        }
        else {
            System.out.println("The entered string " + input + " is not a palindrome\n");
        }
        scanner.close();
    }
}