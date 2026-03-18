import java.util.Scanner;

public class Reverse_arr {
    public static void main(String[] args) {
        System.out.println("enter no of element in array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse of array is");
        // normal method
        // for(int i=n-1;i>=0;i--){
        //     System.out.println(arr[i]);
        // }

        // swap method
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
        }
    }
    
}
