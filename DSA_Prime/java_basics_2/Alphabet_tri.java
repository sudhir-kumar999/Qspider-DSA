//package java_basics_2;

import java.util.Scanner;

public class Alphabet_tri {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            char ch= 'A';
            for(int j=1;j<i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
