// package DSA Part 1 JAVA.Recursion;
// print 1 to 10 using recursion

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter number to print from 1");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printadd(x);
    }

    public static void printadd(int n){
        if(n<=10){
        System.out.println(n);
        printadd(n+1);
        // System.out.println(n);
        }

    }
}
