
public class q9 {
    public static void main(String[] args) {
        int start = 200;
        int end =20000;
        int count=0;
        for(int i=start; i<=end;i++){
            if(isPalindrome(i) && isPrime(i)){
                count++;
                System.out.println("Both palindrome and prime is "+i);
                    
            }
        }
        System.out.println("total prime is "+count);
        
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

    public static boolean isPrime(int n){
        if(n==1) return false;
        else if(n==2 || n==3) return true;
        else if(n%2==0) return false;
        for (int i=3;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
