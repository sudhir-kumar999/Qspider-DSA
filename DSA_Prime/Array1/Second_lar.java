import java.util.Scanner;

public class Second_lar {
    public static void main(String[] args) {
        System.out.println("Enter no of array element");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter array element");
        int[] arr = new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
                index=i;
            }
        }
        System.out.println("first largest element is "+largest);

        for(int i=index;i<n;i++){
            arr[i]=arr[i+1];
        }
        int sec_large= arr[0];
        
        for(int i=0;i<n-1;i++){
            if(arr[i]>sec_large){
                sec_large=arr[i];
            }
        }
        System.out.println("Second largest element is "+sec_large);
        
    }
    
}
