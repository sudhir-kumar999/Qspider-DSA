
public class q8 {
    public static void main(String[] args) {
        int kth = 3;
        int count=0;
        for(int i=0;;i++){
            if(isPalindrome(i)){
                count++;
                if(count==kth){
                System.out.println("kth palindrome is "+i);
                    return;
                }
            }
        }
        
    }

    public static boolean isPalindrome(int n){
        int original = n;
        int rev=0;
        while(original>0){
        int rem = original%10;
        rev = rev*10+rem;
        original=original/10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
    
}
