//package 1. Interview Questions;

public class Rev_a_no {
    public static void main(String[] args) {
        int n=2546;

        int rev=0;
        while(n>0){
        int x = n%10;
         rev=rev*10+x;
         n=n/10;
        }

         System.out.println(rev);
    }
    
}
