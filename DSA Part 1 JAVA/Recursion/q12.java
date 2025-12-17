public class q12 {
    public static void main(String[] args) {
        int num = 35653;
        int res = palindrome(num, 0);
        // System.out.println(res);
        if(num==res){
            System.out.println("number is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

    public static int palindrome(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        int last = num % 10;
        rev = rev * 10 + last;
        return palindrome(num / 10, rev);
    }

}
