//package Practice_Question;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter number to check armstrong");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=x;
        int cube=0;
        while(n!=0){
        
        double digit = n%10;
        cube+=Math.pow( digit, 3);
        n=n/10;
        
        }
        //System.out.println(cube);
        if(cube==x){
            System.out.println("Given number is armstrong");
        } else{
            System.out.println("Not armstrong");
        }
        
    }
    
}
