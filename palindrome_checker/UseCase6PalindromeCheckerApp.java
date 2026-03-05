import java.util.*;

public class QueueStackPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        for (int i = 0; i < input.length(); i++) {

            char fromQueue = queue.remove();  // Dequeue (FIFO)
            char fromStack = stack.pop();     // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The word is a Palindrome.");
        } else {
            System.out.println("The word is NOT a Palindrome.");
        }

        sc.close();
    }
}
