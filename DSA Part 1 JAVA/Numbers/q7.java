
public class q7 {
    public static void main(String[] args) {
        int start = 200;
        int end = 2000;
        int count=0;
        for(int i=start; i<end;i++){
            if(isPalindrome(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total count is"+count);
        
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
