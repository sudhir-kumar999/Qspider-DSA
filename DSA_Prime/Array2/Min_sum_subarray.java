//package Array2;

import java.util.Scanner;

public class Min_sum_subarray {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[100];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int curSum=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            curSum+=arr[i];
            if(curSum>0)
        }
    }
    
}
