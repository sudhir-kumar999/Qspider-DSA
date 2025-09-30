//package Loop_questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter no to find fibonacci");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int first_num=0;
        int sec_num=1;
        for(int i=1;i<=n;i++){
            System.out.println(first_num);
            int next=first_num+sec_num;
            first_num=sec_num;
            sec_num=next;
            
        }
    }
    
}
