//package Array1;

import java.util.Scanner;

public class Declare_Arr {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc= new Scanner(System.in);
        int age[] = new int[5];
        for(int i=0;i<5;i++){
            age[i]=sc.nextInt();
        }
        

        for(int j=0;j<5;j++){
            System.out.println("roll of " + (j+1) + "is "+age[j]);
        }
    }
    
}
