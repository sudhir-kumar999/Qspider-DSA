
public class q8 {
    public static void main(String[] args) {
        int n= 43705;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
            
        }
        System.out.println(rev);
        while(rev>0){
            int remrev=rev%10;
            System.out.println(remrev);
            rev/=10;
        }
        
    }
    
}
