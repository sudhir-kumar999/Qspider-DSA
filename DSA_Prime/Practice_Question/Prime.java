//package Practice_Question;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}
