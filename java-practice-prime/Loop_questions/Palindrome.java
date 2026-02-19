
public class Palindrome {
    public static boolean palindrome(int num) {
        if (num <= 0) {
            return false;
        }
        int rev=0;
        int original=num;
        while (num > 0) {
            int rem = num % 10;
            rev=rev*10+rem;
            num=num/10;
        }
        // System.out.println(rev);
        if(original==rev){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean res=palindrome(1201);
        // System.out.println(res);
        if(res==true){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

}
