
public class q6 {
    public static void main(String[] args) {
        int n = 121;
        if (isPalindrome(n)) {
            System.out.println("given number is palindrome");
        } else {
            System.out.println("given number is not palindrome");

        }

    }

    public static boolean isPalindrome(int n) {
        int rev = 0;
        int original =n;
        
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (original == rev) {
            return true;
        }
        return false;

    }

}
