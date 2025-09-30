//package java_basics_2;

import java.util.Scanner;

public class Left_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter no of column to print");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
