//package Two pointer;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr= new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int left =0;
        int right =n-1;
        
        while(left<right){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
