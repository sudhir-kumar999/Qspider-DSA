//package Loop_questions;

import java.util.Scanner;

public class Sum_of_n_no {
    public static void main(String[] args) {
        System.out.println("Enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("Enter elements");
        // for(int i=0;i<n;i++){
        // int ele = sc.nextInt();
        // }
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

}
