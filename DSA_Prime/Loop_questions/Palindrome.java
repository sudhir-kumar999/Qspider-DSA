//package Loop_questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter no to check palindrome or not");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int new_num=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==new_num){
            System.out.println(new_num+" is palindrome number");
        }else{
            System.out.println(new_num+" is not palindrome");
        }
    }
    
}
