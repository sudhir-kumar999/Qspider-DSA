//package 1. Interview Questions;

import java.util.Scanner;

public class Prime_1_to_n {
    public static void main(String[] args) {
        System.out.println("Enter no of terms to print prime number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<n;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    break;
                } else{
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    
}
