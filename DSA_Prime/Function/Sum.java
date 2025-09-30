//package Function;

import java.util.Scanner;

public class Sum {
    public static int sum(int a, int b){
        int c= a+b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("enter 2 number to add");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result =sum(a,b);
        System.out.println("sum is "+result);
    }
    
}
