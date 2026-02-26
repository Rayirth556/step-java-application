import java.util.Scanner;
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check whether its palindrome:\n");
        String original = sc.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();
        if(original.equals(reversed)) {
            System.out.println("The input palindrome " + original + " is a palindrome");
        }
        else {
            System.out.println("The input palindrome " + original + " is not a palindrome");
        }
        sc.close();
    }
}