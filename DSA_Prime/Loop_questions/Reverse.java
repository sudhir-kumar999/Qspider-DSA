//package Loop_questions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        while (n!=0) {
            
        
        int digit=n%10;
        rev=rev*10+digit;
        n=n/10;
        
        }
        System.out.println(rev);
    }
    
}
