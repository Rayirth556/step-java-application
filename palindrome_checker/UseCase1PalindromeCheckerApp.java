public class UseCase1PalindromeCheckerApp {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if(isPalindrome(str)) {
            System.out.println("The entered string " + str + " is a palindrome");
        }
        else {
            System.out.println("The entered string " + str + " is not a palindrome");
        }
    }
}