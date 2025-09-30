//package Function;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int a) {
        int fact = 1;
        
            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }
         
        return fact;

    }

    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        if (n >= 1) {
             int result = factorial(n);
             System.out.println("factorial is " + result);
        } else if (n == 0) {
            System.out.println("Factorial of 0 is 1");
            

        } else {
            System.out.println("Factorial is not defined for non negative integer");
            
        }
        
    }

}
