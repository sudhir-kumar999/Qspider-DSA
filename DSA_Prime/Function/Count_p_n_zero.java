//package Function;

import java.util.Scanner;

public class Count_p_n_zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posCount=0;
        int negCount=0;
        int zeroCount=0;
        char choice;

        do{
            System.out.println("Enter number");
            int num = sc.nextInt();
            if(num>0){
                posCount++;
            } else if(num<0){
                negCount++;
            }
            else{
                zeroCount++;
            }

            System.out.println("Do you want to continue");
             choice = sc.next().charAt(0);
        }
        while(
            choice=='Y' || choice=='y'
        );

        System.out.println("Total numbers are");
        System.out.println("Positive numbers are "+posCount);
        System.out.println("Positive numbers are "+negCount);
        System.out.println("Positive numbers are "+zeroCount);
    }
    
}
