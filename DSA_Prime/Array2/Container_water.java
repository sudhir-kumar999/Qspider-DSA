//container with most water using two pointer

import java.util.Scanner;

public class Container_water {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[100];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxArea=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int height=Math.min(arr[left], arr[right]);
            int distance = right-left;

            int area = height*distance;
            maxArea=Math.max(maxArea, area);

            if(arr[left]<arr[right]){
                left++;
            } else{
                right--;
            }
        }
        System.out.println("Container with most water is "+maxArea);
    }


    
}
