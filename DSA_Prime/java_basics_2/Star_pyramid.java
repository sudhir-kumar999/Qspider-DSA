//package java_basics_2;

import java.util.Scanner;

public class Star_pyramid {
    public static void main(String[] args) {
        System.out.println("Enter no row column to print");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
