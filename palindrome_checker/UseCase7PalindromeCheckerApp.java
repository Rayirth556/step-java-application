import java.util.*;

public class DequePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst(); // remove from front
            char rear = deque.removeLast();   // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word is a Palindrome.");
        } else {
            System.out.println("The word is NOT a Palindrome.");
        }

        sc.close();
    }
}
