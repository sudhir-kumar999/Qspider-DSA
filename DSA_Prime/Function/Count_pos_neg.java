//package Function;

import java.util.Scanner;

public class Count_pos_neg {
    public static int positiveCount(int n){
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int countPos=0;
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
           
                if(value>0){
                countPos++;
            }
        }
        return countPos;

    }

    public static int negativeCount(int n){
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int countNeg=0;
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
           
                if(value>0){
                countNeg++;
            }
        }
        return countNeg;

    }

    public static int zeroCount(int n){
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int countZero=0;
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
           
                if(value>0){
                countZero++;
            }
        }
        return countZero;

    }

    public static void main(String[] args) {
        System.out.println("enter elements");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
            
        
        int res = positiveCount(num);
        System.out.println("Positive number is " + res);
        
    }
    
}
