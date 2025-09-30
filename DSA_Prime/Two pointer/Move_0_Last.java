//package Two pointer;

import java.util.Scanner;

public class Move_0_Last {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = 0;

        while(right<n){
            if(arr[right]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
            right++;
        }
        
        System.out.println("Array element after moving zero");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        
    }

}
